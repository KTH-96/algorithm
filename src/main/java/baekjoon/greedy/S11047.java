package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int num = Integer.parseInt(st.nextToken());
        int money = Integer.parseInt(st.nextToken());

        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int count = 0;
        int sum = 0;
        for (int i = num - 1 ; i >= 0; i--) {
            if (money < arr[i]) {
                continue;
            }
            while (true) {
                sum = money - arr[i];
                if (sum < 0) break;
                money = sum;
                count++;
            }
        }
        System.out.println(count);
    }


}
