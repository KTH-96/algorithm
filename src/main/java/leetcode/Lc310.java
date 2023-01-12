package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Lc310 {
    public static void main(String[] args) {
        Lc310 a = new Lc310();
        System.out.println(a.findMinHeightTrees(6, new int[][]{
                {0, 3}, {1, 3}, {2, 3}, {4, 3}, {5, 4}
        }));
    }
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        if (n == 1) {
            return Collections.singletonList(0);
        }
        List<Set<Integer>> nodes = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            nodes.add(new HashSet<>());
        }

        for (int[] edge : edges) {
            nodes.get(edge[0]).add(edge[1]);
            nodes.get(edge[1]).add(edge[0]);
        }

        List<Integer> leaves = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (nodes.get(i).size() == 1) {
                leaves.add(i);
            }
        }

        while (n > 2) {
            n -= leaves.size();
            List<Integer> newLeaves = new ArrayList<>();
            for (Integer leaf : leaves) {
                Integer next = nodes.get(leaf).iterator().next();//어차피 1개만 들어있음
                nodes.get(next).remove(leaf);
                if (nodes.get(next).size() == 1) {
                    newLeaves.add(next);
                }
            }
            leaves = newLeaves;
        }
        return leaves;
    }
}
