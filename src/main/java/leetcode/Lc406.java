package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Lc406 {
    public int[][] reconstructQueue(int[][] people) {
        PriorityQueue<int[]> q = new PriorityQueue<>((o1, o2) -> {
            if (o1[0] == o2[0]) {
                return o1[1] - o2[1];
            }
            return o2[0] - o1[0];
        });
        for (int[] person : people) {
            q.offer(person);
        }

        List<int[]> result = new ArrayList<>();
        while (!q.isEmpty()) {
            int[] poll = q.poll();
            System.out.println(poll[0]+ ", " + poll[1]);
            result.add(poll[1], poll);
        }

        return result.toArray(people);
    }
}
