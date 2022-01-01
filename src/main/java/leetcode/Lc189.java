package leetcode;

public class Lc189 {
    public void rotate(int[] nums, int k) {
        k %= nums.length;

        reverse(nums, nums.length - k, nums.length - 1);
        reverse(nums, 0, nums.length - k - 1);
        reverse(nums, 0 , nums.length -1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int num = nums[start];
            nums[start] = nums[end];
            nums[end] = num;

            start++;
            end--;
        }

    }
}
