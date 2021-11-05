package programmers.level2;

import java.util.Comparator;
import java.util.PriorityQueue;

public class num42587 {
    public int solution(int[] priorities, int location) {
        PriorityQueue<Integer> print = new PriorityQueue<>(Comparator.reverseOrder());
        int answer = 0;

        for (int i = 0; i < priorities.length; i++) {
            print.add(priorities[i]);
        }
        while (print.isEmpty()) {
            for (int i = 0; i < priorities.length; i++) {
                if (priorities[i] == print.peek()) {

                }
                print.poll();
                answer++;
            }
        }
        return answer;
    }
}
