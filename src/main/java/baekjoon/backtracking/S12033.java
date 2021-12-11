package baekjoon.backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S12033 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testCase; i++) {
            int itemNum = Integer.parseInt(br.readLine());

            String item = br.readLine();//9 9 12 12 12 15 16 20 -> 9 12, 12 16, 15 20
            StringTokenizer st = new StringTokenizer(item, " ");
            while (st.hasMoreTokens()) {

            }
        }

        br.close();
    }
}
