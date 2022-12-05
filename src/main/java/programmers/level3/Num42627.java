package programmers.level3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Num42627 {
    public int solution(int[][] jobs) {
        Arrays.sort(jobs, Comparator.comparingInt(o -> o[0]));
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(o -> o[1]));
        int totalUseTime = 0;
        int jobIndex = 0;
        int count = 0;
        int time = 0;
        while (count < jobs.length) {
            while (jobIndex < jobs.length && jobs[jobIndex][0] <= time) {
                pq.add(jobs[jobIndex++]);
            }
            if (pq.isEmpty()) {
                time = jobs[jobIndex][0];
            } else {
                int[] poll = pq.poll();
                totalUseTime += poll[1] + time - poll[0];
                time += poll[1];
                count++;
            }
        }
        return totalUseTime / jobs.length;
    }

    public static void main(String[] args) {
        Num42627 a = new Num42627();
        a.solution(new int[][]{{0, 3}, {1, 9}, {2, 6}});
    }
}
