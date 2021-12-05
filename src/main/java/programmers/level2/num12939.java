package programmers.level2;

import java.util.Arrays;

public class num12939 {
    public String solution(String s) {
        String[] str = s.split(" ");
        int[] values = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            values[i] = Integer.parseInt(str[i]);
        }
        Arrays.sort(values);
        String a = String.valueOf(values[0]);
        String b = String.valueOf(values[values.length - 1]);

        String answer = a + " " + b;
        return answer;
    }
}
