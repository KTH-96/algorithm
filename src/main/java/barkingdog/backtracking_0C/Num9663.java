package barkingdog.backtracking_0C;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num9663 {

	static int cont;
	static int n;
	static boolean[] isused1;
	static boolean[] isused2;
	static boolean[] isused3;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		isused1 = new boolean[2*n];
		isused2 = new boolean[2*n];
		isused3 = new boolean[2*n];

		func(0);
		System.out.println(cont);
	}

	private static void func(int cur) {
		if (n == cur) {
			cont++;
			return;
		}

		for (int i = 0; i < n; i++) {
			if (isused1[i] || isused2[i + cur] || isused3[cur - i + n - 1]) {
				continue;
			}
			isused1[i] = true;
			isused2[i + cur] = true;
			isused3[cur - i + n - 1] = true;
			func(cur + 1);
			isused1[i] = false;
			isused2[i + cur] = false;
			isused3[cur - i + n - 1] = false;
		}
	}
}
