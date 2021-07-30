package m07.day0730;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S1085 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w =  Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int wx = w - x;
        int hy = h - y;
        if (x <= wx) wx = x;
        if (y <= hy) hy = y;

        System.out.println(wx <= hy ? wx : hy);
    }
}
