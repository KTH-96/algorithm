package m09.w05.day29;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        int result =0;
        for (int i = 0; i < num; i++) {
            int number = i;
            int total = 0;

            while (number != 0) {
                total += number % 10;
                number /= 10;
            }
            if (total + i == num) {
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}
