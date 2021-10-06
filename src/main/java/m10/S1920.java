package m10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class S1920 {
    static int[] arrN, arrM;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        arrN = new int[N];
        StringTokenizer st  = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arrN[i] = Integer.parseInt(st.nextToken());
        }
        int M = Integer.parseInt(br.readLine());
        arrM = new int[M];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i <M; i++) {
            arrM[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arrM);
        Arrays.sort(arrN);
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (arrN[j] == arrM[j]){
                    count = 1;
                    sb.append(count).append('\n');
                    continue;
                }
                count = 0;
            }
            sb.append(count).append("\n");
        }

    }
}
