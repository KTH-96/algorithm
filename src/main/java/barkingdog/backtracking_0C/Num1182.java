package barkingdog.backtracking_0C;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num1182 {
	static int n;
	static int s;
	static int count;
	static int[] arr;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		n = Integer.parseInt(st.nextToken());
		s = Integer.parseInt(st.nextToken());

		arr = new int[n];
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i <n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		count = 0;
		func(0, 0);
		if (s == 0) count--;
		System.out.println(count);
	}

	private static void func(int cur, int total) {
		if (cur == n) {
			if (total == s){
				count ++;
			}
			return;
		}
		func(cur + 1, total);
		func(cur + 1, total + arr[cur]);
	}
}
