package codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class cp3004 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] countingArr = new int[500001];
        int countingNum = Integer.parseInt(br.readLine());

        int[] arr = new int[countingNum];
        int[] dummyArr = new int[countingNum];
        String[] numbers = br.readLine().split(" ");
        for (int i = 0; i < countingNum; i++) {
            int number = Integer.parseInt(numbers[i]);
            arr[i] = number;
            dummyArr[i] = number;
        }
        Arrays.sort(arr);
        for (int i = 0; i < countingNum; i++) {
            countingArr[arr[i]] = i;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < countingNum; i++) {
            sb.append(countingArr[dummyArr[i]]).append(" ");
        }
        System.out.println(sb);
    }
}
