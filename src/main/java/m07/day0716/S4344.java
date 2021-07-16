package m07.day0716;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S4344 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] arr;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int student = Integer.parseInt(st.nextToken());
            int score = 0;

            arr = new int[student];
            for (int j = 0; j < student; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
                score += arr[j];
            }
            double average = score/student;
            double rate = 0;

            for (int j = 0; j < student; j++) {
                if (arr[j] > average){
                    rate++;
                }
            }
            rate = rate/student*100;
            //%.3f라고만하면 안된다...
            sb.append(String.format("%.3f%%", rate)).append("\n");
        }
        System.out.println(sb);
    }
}
