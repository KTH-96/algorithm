package programmers.cocoa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class middleString {
    public static void main(String[] args)  {
        System.out.println(solution("qwer"));
        //subString을 사용 하면 더 좋음
    }

    static String solution(String s) {
        String result;
        if(s.length()%2 != 0){
           return result = String.valueOf(s.charAt(s.length() / 2));
        }else {
            return result = String.valueOf(s.charAt(s.length() / 2 - 1)) + String.valueOf(s.charAt(s.length() / 2));
        }
    }
}
