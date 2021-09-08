package m09.w02.day08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S1436 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int six = 666;
        int c = 1;

        while (c != N) {
            six++;
            if (Integer.toString(six).contains("666")) {
                c++;
            }
        }
        System.out.println(six);

    }
}
