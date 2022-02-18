package barkingdog.arrangement03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class num3273 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int x = Integer.parseInt(br.readLine());
        int count = 0;
        int left = 0;
        int right = n -1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == x) {
                count++;
            }
            if (sum <= x)left++;
            else right--;
        }
        System.out.println(count);
    }
}
