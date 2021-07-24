package m07.day0724;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S10250 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine());
        StringTokenizer st;

        int y = 0;
        int x =0;
        for (int i = 0; i < test; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());

            if (n % h == 0){
                y = h * 100;
                x = n / h;
                System.out.println(y+x);
            } else{
                y = n % h * 100;
                x = n / h + 1;
                System.out.println(y+x);
            }

        }

    }
}
