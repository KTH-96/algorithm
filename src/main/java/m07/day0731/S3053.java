package m07.day0731;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S3053 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int r = Integer.parseInt(br.readLine());

        double result = (r * r)* Math.PI;
        System.out.println( String.format("%.6f", result) );
        System.out.println( (2*r*r));
    }
}
