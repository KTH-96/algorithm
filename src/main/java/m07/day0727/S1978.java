package m07.day0727;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int c =0;
        while (st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());
            boolean a = true;

            if (num == 1) {
                continue;
            }
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0){
                    a =false;
                    break;
                }
            }
            if (a == false) {
                c++;
            }
        }
        System.out.println(c);
    }
}
