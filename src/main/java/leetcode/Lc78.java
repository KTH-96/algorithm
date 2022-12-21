package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Lc78 {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();

        dfs(answer, nums, new ArrayList<>(), 0);
        return answer;
    }

    private void dfs(List<List<Integer>> answer, int[] nums, List<Integer> list, int depth) {
        answer.add(new ArrayList<>(list));

        for (int i = depth; i < nums.length; i++) {
            list.add(nums[i]);
            dfs(answer, nums, list, i + 1);
            list.remove(list.size() - 1);
        }
    }
}
