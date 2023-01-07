package leetcode;

import java.util.Deque;
import java.util.LinkedList;

public class Lc226 {
    public TreeNode invertTree(TreeNode root) {
        Deque<TreeNode> deq = new LinkedList<>();
        deq.offer(root);
        while (!deq.isEmpty()) {
            TreeNode node = deq.poll();

            if (node != null) {
                TreeNode temp = node.left;
                node.left = node.right;
                node.right = temp;
                deq.offer(node.left);
                deq.offer(node.right);
            }
        }
        return root;
//        return dfs(root);
    }

//    private TreeNode dfs(TreeNode node) {
//        if (node == null) {
//            return null;
//        }
//
//        TreeNode left = dfs(node.left);
//        TreeNode right = dfs(node.right);
//        node.left = right;
//        node.right = left;
//
//        return node;
//    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {

        }
        TreeNode(int val) {
            this.val = val;
        }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

}
