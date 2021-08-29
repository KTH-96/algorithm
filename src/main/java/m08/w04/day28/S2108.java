package m08.w04.day28;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class S2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        int[] counting = new int[8001];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        double r1 = 0;
        for (int i = 0; i < arr.length; i++) {
            r1 += arr[i];
        }
        sb.append((int)Math.round(r1/N)).append('\n');//산술평균
        sb.append(arr[(N / 2 + 1)]).append('\n');//중앙값
        for (int i = 0; i < arr.length; i++) {
            counting[arr[i]]++;
        }

        sb.append(arr[N-1] - arr[0]).append('\n');//범위
    }
}
