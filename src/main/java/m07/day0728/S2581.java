package m07.day0728;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class S2581{
    public static void main (String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        boolean[] prime = new boolean[b+1];
        prime[0] = true;
        prime[1] = true;
        for (int i = 2; i <= Math.sqrt(prime.length); i++) {
            if (prime[i]) continue;
            for (int j = i*i; j < prime.length ; j += i) {
                prime[j] = true;
            }
        }
        int sum = 0;
        int min = 0;
        for (int i = a; i <= b; i++) {
            if (prime[i] == false) {
                sum += i;
                if (min == 0) min = i;
            }
        }
        if (sum == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
