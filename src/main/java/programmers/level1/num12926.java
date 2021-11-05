package programmers.level1;

import java.util.Arrays;

public class num12926 {
    public static void main(String[] args) {
        num12926 aa = new num12926();
        String a_b_z = aa.solution("a B z", 4);
        System.out.println(a_b_z);
    }
    public String solution(String s, int n) {
        char[] ch = s.toCharArray();
        String answer = "";
        for (int i = 0; i < ch.length; i++) {
            if (Character.isLowerCase(ch[i])) {
                ch[i] = (char) ((ch[i] - 'a' + n) % 26 + 'a');
            }else if (Character.isUpperCase(ch[i])){
                ch[i] = (char) ((ch[i] - 'A' + n) % 26 + 'A');
            }
            answer += ch[i];
        }
        return answer;
    }
}
