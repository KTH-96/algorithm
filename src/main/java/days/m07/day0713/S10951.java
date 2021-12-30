package days.m07.day0713;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S10951 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        String result;
        while ((result=br.readLine())!= null) {
            st = new StringTokenizer(result, " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            sb.append(a + b).append("\n");

        }
//        while (true) {
//            try{
//                st = new StringTokenizer(br.readLine(), " ");
//                sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())).append("\n");
//            }catch (NullPointerException e){
//                break;
//            }
//        }
        br.close();
        System.out.println(sb);
    }
}
