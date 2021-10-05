package m09.w05.day29;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int result = search(arr, N, M);
        System.out.println(result);
    }

    static int search(int[] arr, int n, int m) {
        int result = 0;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i+1; j < n - 1; j++) {
                for (int k = j+1; k < n; k++) {
                    int max = arr[i] + arr[j] + arr[k];
                    if (max == m) {
                        return max;
                    }
                    if (result < max && max < m) {
                        result = max;
                    }
                }
            }
        }
        return result;
    }
}