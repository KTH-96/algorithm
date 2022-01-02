package leetcode;

public class Lc283 {
    public void moveZeroes(int[] nums) {
        int num = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[num];
                nums[num] = nums[i];
                nums[i] = temp;
                num++;
            }
        }
    }
}
