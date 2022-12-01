package programmers.level2;

import java.util.Comparator;
import java.util.PriorityQueue;

public class num42587 {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        PriorityQueue<Integer> print = new PriorityQueue<>(Comparator.reverseOrder());
        for (Integer priority : priorities) {
            print.offer(priority);
        }
        while (!print.isEmpty()) {
            for (int i = 0; i < priorities.length; i++) {
                if (priorities[i] == print.peek()) {
                    print.poll();
                    answer++;
                    if (i == location) {
                        return answer;
                    }
                }
            }
        }

        return answer;
    }
}
