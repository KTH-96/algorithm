package days.m07.day0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S10950 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringTokenizer st;

        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
                System.out.println(a + b);
        }
        br.close();
        //빌더사용시
        //StringBuilder sb = new StringBuilder();
        //
        //		for (int i = 0; i < t; i++) {
        //			st = new StringTokenizer(br.readLine(), " ");
        //			sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));
        //			sb.append('\n');
        //		}
        //
        //		System.out.println(sb);

    }
}
