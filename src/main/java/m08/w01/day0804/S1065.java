package m08.w01.day0804;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S1065 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int result = oneNum(n);

        System.out.println(result);
    }

    public static int oneNum(int n) {
        int c = 0;
        if (n < 100) {
            c = n;
        }else {
            c = 99;
            if (n == 1000) {
                n = 999;
            }

            for (int i = 100; i <= n; i++) {
                int h = i / 100;
                int t = (i/10)%10;
                int o = i%10;

                if ((h - t) == (t - o)) {
                    c++;
                }
            }

        }
        return c;
    }

}
