package m08.w01.day0801;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S1193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());

        int n = 0;
        int c = 0;
        while (c < x) {
            n++;
            c = n * (n+1) / 2;
        }


        int top = 0;
        int bot = 0;
        if (n % 2 == 1) {
            top = 1 + (c - x);
            bot = n - (c - x);
            System.out.println(top+"/"+bot);
        } else {
            top = n - (c - x);
            bot = 1 + (c - x);
            System.out.println(top+"/"+bot);
        }
    }
}
