package m07.day0717;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S1065 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print(count(Integer.parseInt(br.readLine())));
    }

    public static int count(int num) {
        int c = 0;

        if(num < 100) return num;
        else {
            c =99;
            if (num == 1000) num = 999;

            for (int i = 100; i < num; i++) {
                int hun = i / 100;
                int ten = (i / 10) % 10;
                int one = i % 10;
                if (hun - ten == ten - one) {
                    c++;
                }
            }
        }

        return c;
    }
}
