package days.m07.day0711;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S2753 {
    public static void main(String[] args) throws IOException {
        //윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(br.readLine());
        System.out.println( (year%4 == 0 && year%100 != 0 || year%400 ==0) ? "1" : "0");
    }
}
