package barkingdog.recursion_0A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num11729 {
	private static StringBuilder sb;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		sb = new StringBuilder();
		sb.append((int) Math.pow(2, n) - 1).append("\n");

		function(1, 3, n);
		System.out.println(sb);
	}

	private static void function(int a, int b, int n) {
		if (n == 1){
			sb.append(a).append(" ").append(b).append("\n");
			return;
		}
		function(a, 6 - a - b, n - 1);
		sb.append(a).append(" ").append(b).append("\n");
		function(6 - a - b, b, n - 1);
	}
}
