package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class ecote1_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int peopleNum = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] arr = new int[peopleNum];
        for (int i = 0; i < peopleNum; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int result = 0;
        int count = 0;
        for (int i = 0; i < peopleNum; i++) {
            count++;
            if (arr[i] == count) {
                result++;
                count = 0;
            }
        }
        System.out.println(result);
    }
}
