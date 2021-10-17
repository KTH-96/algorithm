package programmers.level1;

import java.util.Arrays;

public class num12982 {
    public int solution(int[] d, int budget) {
        //d 신청금액 budget 예산
        int answer = 0;
        Arrays.sort(d);
        int result = 0;
        for (int i = 0; i < d.length; i++) {
            answer += d[i];
            if (answer > budget) break;
            result++;
        }
        return result;
    }
}
