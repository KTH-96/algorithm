package days.m07.day0714;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine())*Integer.parseInt(br.readLine())*Integer.parseInt(br.readLine());
        int[] arr = new int[10];

        String result = String.valueOf(x);

        for (int i = 0; i < result.length(); i++) {
            arr[(result.charAt(i) - '0')]++;
        }

        for (int i: arr) {
            System.out.println(i);
        }
    }
}
