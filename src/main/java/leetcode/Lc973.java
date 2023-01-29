package leetcode;

import java.util.PriorityQueue;

public class Lc973 {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> q = new PriorityQueue<>((a, b) ->
                (int) ((Math.pow(a[0], 2) + Math.pow(a[1], 2)) - (Math.pow(b[0], 2) + Math.pow(b[1], 2))));
        for (int[] point : points) {
            q.offer(point);
        }
        int[][] answer = new int[k][2];
        for (int i = 0; i < k; i++) {
            answer[i] = q.poll();
        }
        return answer;
    }
}
