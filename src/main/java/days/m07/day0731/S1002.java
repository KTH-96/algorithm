package days.m07.day0731;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S1002 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int tc = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < tc; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int r1 = Integer.parseInt(st.nextToken());

            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int r2 = Integer.parseInt(st.nextToken());

            int distance = (int)(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
            if(x1 == x2 && y1 == y2 && r1 == r2) {
                sb.append(-1).append("\n");
            } else if (distance == Math.pow(r2 - r1, 2)) {
                sb.append(1).append("\n");
            } else if (distance == Math.pow(r2 + r1, 2)) {
                sb.append(1).append("\n");
            } else if (distance > Math.pow(r2 + r1, 2)){
                sb.append(0).append("\n");
            } else if (distance < Math.pow(r2 - r1, 2)){
                sb.append(0).append("\n");
            } else{
                sb.append(2).append("\n");
            }

        }
        System.out.println(sb);
    }
}
