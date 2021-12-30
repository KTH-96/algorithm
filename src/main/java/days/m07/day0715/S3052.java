package days.m07.day0715;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[42];
        int c = 0;
        for (int i = 0; i < 10; i++) {
            arr[Integer.parseInt(br.readLine()) % 42]++;
        }
        for (int i: arr) {
            if(i != 0) c++;
        }
        System.out.println(c);
    }
}
