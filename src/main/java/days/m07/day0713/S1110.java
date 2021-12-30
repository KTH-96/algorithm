package days.m07.day0713;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S1110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int c = 0;
        int result = n;

        while (true) {
            n = ((n % 10) * 10 + ((n / 10) + (n % 10)) % 10);
            c++;
            if (n == result) {
                break;
            }
        }
        br.close();
        System.out.println(c);


    }
}
