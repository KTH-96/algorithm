package m07.day0713;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S10952 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        while (true){
            st = new StringTokenizer(br.readLine(), " ");
            int total = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
            if(total == 0)break;
            sb.append(total).append("\n");
        }
        br.close();
        System.out.println(sb);
    }
}
