package m08.w03.day0817;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int cardAll = Integer.parseInt(st.nextToken());
        int total = Integer.parseInt(st.nextToken());

        int[] arr = new int[cardAll];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < cardAll; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int result = search(arr, cardAll, total);
        System.out.println(result);
    }
    static int search(int[] arr, int N, int M) {
        int result = 0;


        for (int i = 0; i < N - 2; i++) {
            for (int j = i + 1; j < N - 1; j++) {
                for (int k = j + 1; k < N; k++) {
                    int sum = arr[i] + arr[j] + arr[k];
                    if (M == sum) {
                        return sum;
                    }
                    if(result < sum && sum < M) {
                        result = sum;
                    }
                }
            }
        }
        return result;
    }
}
