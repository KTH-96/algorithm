package programmers.level1;

import java.util.StringTokenizer;

public class num12930 {
    public static void main(String[] args) {
        num12930 aa = new num12930();
        String try_hello_world = aa.solution("try hello world");
        System.out.println(try_hello_world);
    }
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        String[] str = s.split("");

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (str[i].equals(" ")){
                sb.append(" ");
                count = 0;
            }else {
                if (count % 2 == 0) {
                    str[i]= str[i].toUpperCase();
                    count++;
                } else if (count % 2 == 1) {
                    str[i]= str[i].toLowerCase();
                    count++;
                }
                sb.append(str[i]);
            }

        }
        return sb.toString();
    }
}
