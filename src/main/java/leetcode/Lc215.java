package leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Lc215 {
    public int findKthLargest(int[] nums, int k) {
//        PriorityQueue<Integer> q = new PriorityQueue<>(Comparator.reverseOrder());
//        for (int num : nums) {
//            q.offer(num);
//        }
//
//        int answer = 0;
//        for (int i = 0; i < k; i++) {
//            answer = q.poll();
//        }
//        return answer;
        Arrays.sort(nums);

        return nums[nums.length - k];
    }
}
