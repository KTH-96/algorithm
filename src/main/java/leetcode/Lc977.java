package leetcode;

import java.util.Arrays;

public class Lc977 {
    public int[] sortedSquares(int[] nums) {
        int[] answer = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            answer[i] = nums[i] * nums[i];
        }
        Arrays.sort(answer);
        return answer;
    }
}
