package programmers.level1;

import java.util.HashSet;

public class num1845 {
    public int solution(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i : nums) {
            hashSet.add(i);
        }
        if (hashSet.size() <= nums.length/2){
            return hashSet.size();
        }else {
            return nums.length / 2;
        }
    }
}
