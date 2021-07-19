package m07.day0719;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int c = 0;
        while (st.hasMoreTokens()) {
            st.nextToken();
            c++;
        }
        System.out.println(c);
//        System.out.println(st.countTokens()); -> countTokens() 는 토큰의 개수를 반환한다

    }
}
