package days.m09.w04.day23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S1934{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int gcd = GCD(a, b);

            sb.append(a * b / gcd).append('\n');
        }
        System.out.println(sb);

    }

    static int GCD(int a, int b) {
        int r = 0;
        while (b != 0 ) {
            r = a % b;

            a = b;
            b = r;
        }
        return a;
    }
}
