package days.m07.day0717;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S11654 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = br.readLine().charAt(0);
        System.out.println(a);

        //가장 기초 입력방법인 System.in 을 쓰는 방법  System.in 은 byte 값으로 문자 한 개만 읽으면서 해당 문자에 대응되는 아스키코드 값을 저장
        //int a = System.in.read();
        //System.out.print(a);
    }
}
