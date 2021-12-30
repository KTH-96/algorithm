package days.m07.day0723;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S1193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        //분자 분모 합 sum ,c =  sum - 1 이 항의 갯수
        //c가 짝수일때 분자 -1 분모 +1 (분자나 분모가 1일때까지)
        //c가 홀수일때 분모 +1 분자 -1 (동일) -> 둘다 카운트해서 x값이 될때까지 하고 break
        int sum = 2;
        int c = 1;

        while (true) {

        }
    }
}
