package days.m07.day0717;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S10809 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String S = br.readLine();
        int[] arr =new int[26];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }
        for (int i = 0; i < S.length(); i++) {
            if (arr[S.charAt(i)-97] == -1) arr[S.charAt(i)-97] = i;
        }
        for (int i:arr) {
            sb.append(i).append(" ");
        }
        System.out.println(sb);

    }
}
