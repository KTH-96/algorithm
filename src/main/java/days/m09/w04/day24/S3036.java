package days.m09.w04.day24;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S3036 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//StringTokenizer를 사용해서 배열을 사용하지 않고 다 받을수있는데 배열을 사용해서 시간초과 발생
        int fr = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < t; i++) {
            int otherRing = Integer.parseInt(st.nextToken());
            int gcd = GCD(fr, otherRing);
            sb.append(fr / gcd).append('/').append(otherRing / gcd).append('\n');
        }
        System.out.println(sb);
    }

    static int GCD(int i, int i1) {
        int r;
        while (i1 != 0) {
            r = i % i1;
            i = i1;
            i1 = r;
        }
        return i;
    }
}
