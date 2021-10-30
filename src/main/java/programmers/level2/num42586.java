package programmers.level2;

import java.util.Arrays;

public class num42586 {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] endDay = new int[100];
        int day = 1;
        for (int i = 0; i < progresses.length; i++) {
            while (progresses[i] + (day * speeds[i]) <= 100) {
                day++;
            }
            endDay[day]++;
        }
        return Arrays.stream(endDay)
                .filter(i -> i != 0)
                .toArray();
    }
}
