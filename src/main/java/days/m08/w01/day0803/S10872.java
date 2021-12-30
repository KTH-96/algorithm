package days.m08.w01.day0803;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S10872 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        if (n == 0) {
            n = 1;
        }

        int factory = 1;
        for (int i = 1; i <= n; i++) {
            factory *= i;
        }
        System.out.println(factory);
    }
}
