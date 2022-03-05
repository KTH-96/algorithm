package programmers.level2;

import java.util.PriorityQueue;

public class num42626 {
    class Solution {
        public int solution(int[] scoville, int K) {
            PriorityQueue<Integer> heap = new PriorityQueue<>();
            for (int i = 0; i < scoville.length; i++) {
                heap.offer(scoville[i]);
            }
            int count = 0;
            while (heap.peek() <= K) {
                if (heap.size() == 1) {
                    return -1;
                }
                int i = heap.poll() + (heap.poll() * 2);
                heap.offer(i);
                count++;
            }
            return count;
        }
    }
}
