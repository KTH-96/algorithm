package days.m07.day0714;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class S10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] arr = new int[n];
        int c =0;

        while (st.hasMoreTokens()) {
            arr[c] = Integer.parseInt(st.nextToken());
            c++;
        }
        Arrays.sort(arr);
        System.out.println(arr[0]+" "+arr[n-1]);
    }
}
