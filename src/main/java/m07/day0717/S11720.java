package m07.day0717;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String num = br.readLine();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += (num.charAt(i) -'0');
        }
        System.out.println(sum);

        //String메소드 중 getByte로 사용
        //br.readLine();	// N 은 쓸모가 없으므로 입력만 받는다.
        //
        //		int sum = 0;
        //
        //  ->  readLine() 으로 읽어들인 문자를 byte[] 로 변환하여 반환
        //		for(byte value : br.readLine().getBytes()) {
        //			sum += (value - '0');	// 또는 (a-48)
        //		}
        //
        //		System.out.print(sum);
    }
}
