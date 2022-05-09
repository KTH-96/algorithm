package barkingdog.backtracking_0C;

import java.util.Scanner;

public class Num15649 {
	static int m,n;
	static boolean[] isUsed;
	static int[] arr;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();

		arr = new int[m];
		isUsed = new boolean[n];
		tracking(n, m, 0);
		System.out.println(sb);
	}

	private static void tracking(int n, int m, int k) {
		if (k == m) {
			for (int result : arr) {
				sb.append(result).append(" ");
			}
			sb.append('\n');
			return;
		}
		for (int i = 0; i < n; i++) {
			if (!isUsed[i]) {
				arr[k] = i + 1;
				isUsed[i] = true;
				tracking(n, m, k + 1);
				isUsed[i] = false;
			}
		}
	}
}
