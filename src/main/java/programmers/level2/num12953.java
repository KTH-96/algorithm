package programmers.level2;

import java.math.BigInteger;

public class num12953 {
    public int solution(int[] arr) {
        int answer = arr[0];
        for (int i = 1; i < arr.length; i++) {
            answer = LCM(answer, arr[i]);
        }
        return answer;
    }

    private int LCM(int answer, int i) {
        return (answer * i) / GCD(answer, i);
    }

    private int GCD(int answer, int i) {
        int a = Math.max(answer, i);
        int b = Math.min(answer, i);
        if (b == 0) return answer;
        return GCD(b, (a % b));
    }
}
