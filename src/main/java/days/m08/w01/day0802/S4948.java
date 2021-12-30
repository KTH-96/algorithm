package days.m08.w01.day0802;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S4948 {

    public static boolean[] arr = new boolean[246913];

    public static void getPrime() {
        arr[0] = true;
        arr[1] = true;

        for (int i = 2; i <= Math.sqrt(arr.length); i++) {
            if (arr[i]) continue;
            for (int j = i * i; j < arr.length; j += i) {
                arr[j] = true;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        getPrime();
        while (true) {
            int n = Integer.parseInt(br.readLine());

            if (n == 0) break;
            if (n == 1) sb.append(1).append("\n");
            if (n > 1) {

                int c = 0;
                for (int i = n; i <= 2 * n ; i++) {
                    if (!arr[i]) {
                        c++;
                    }
                }
                sb.append(c).append("\n");
            }
        }
        System.out.println(sb);
    }
}
