package study.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S10872 {
    static int N;
    static int total = 1;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        int result = fac(N);
        System.out.println(result);
    }

    static int fac(int n) {
        if (n == 0) {
            return 1;
        }
        return n*fac(n - 1);
    }
}
