package m08.w05.day30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class S1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String nums = br.readLine();

        Integer[] arr = new Integer[nums.length()];//N이 1,000,000,000
        for (int i = 0; i < nums.length(); i++) {
            arr[i] = nums.charAt(i) - '0';
        }

        Arrays.sort(arr, Collections.reverseOrder());
        for (Integer integer : arr) {
            sb.append(integer);
        }
        System.out.println(sb);
    }
}
