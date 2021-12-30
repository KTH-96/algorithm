package days.m07.day0729;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class S1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int min = Integer.parseInt(st.nextToken());
        int max = Integer.parseInt(st.nextToken());

        boolean[] prime = new boolean[max + 1];
        prime[0] = true;
        prime[1] = true;

        for (int i = 2; i <= Math.sqrt(prime.length); i++) {
            if (prime[i] == true) continue;
            for (int j = i * i; j < prime.length; j += i) {
                prime[j] = true;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = min; i <= max; i++) {
            if (prime[i] == false) {
                sb.append(i).append("\n");
            }
        }
        System.out.println(sb);
    }
}
