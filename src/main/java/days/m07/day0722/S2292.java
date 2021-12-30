package days.m07.day0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        int i = 1;
        while (num > 0) {
            if (num == 1) break;
            num = num - 6*i;

            ++i;
        }
        System.out.println(i);

    }
}
