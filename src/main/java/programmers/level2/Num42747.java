package programmers.level2;

import java.util.Arrays;

public class Num42747 {
    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);

        for (int i = 0; i < citations.length; i++) {
            int h = citations.length - i;
            if (citations[i] >= h) {
                answer = h;
                return answer;
            }
        }
        return answer;
    }
}
