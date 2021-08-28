package m08.w04.day28;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S10989 {
    public static void main(String[] args) throws IOException {
        //제시된 수위 범위
        int[] counting = new int[10001];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            counting[Integer.parseInt(br.readLine())]++;
        }

        for (int i = 0; i < 10001; i++) {
            while (counting[i] > 0) {
                sb.append(i).append("\n");
                counting[i]--;
            }
        }
        System.out.println(sb);
    }
}
