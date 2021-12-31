package leetcode;

public class Lc704 {
    public static void main(String[] args) {
        Lc704 main = new Lc704();
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
        int search = main.search(nums, target);
        System.out.println(search);
    }
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int mid = 0;

        while (start <= end) {
            mid = (end + start) / 2;
            if (nums[mid] < target) {
                start = mid + 1;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else if (nums[mid] == target) {
                return mid;
            }
        }
        return -1;
    }
}
