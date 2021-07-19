package m07.day0719;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int resultA = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
        int resultB = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());;


        System.out.println(resultA > resultB ? resultA:resultB);


        // byte로 받을때
        //      int A = 0;
        //		int B = 0;
        //
        //		A += System.in.read() - 48;
        //		A += (System.in.read() - 48)*10;
        //		A += (System.in.read() - 48)*100;
        //
        //		System.in.read();	// 공백
        //
        //		B += System.in.read() - 48;
        //		B += (System.in.read() - 48)*10;
        //		B += (System.in.read() - 48)*100;
        //
        //		System.out.println(A > B ? A : B);
    }
}
