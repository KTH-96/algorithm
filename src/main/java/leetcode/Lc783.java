package leetcode;


public class Lc783 {
    int min = (int)Math.pow(10, 5);
    int prev = (int) -Math.pow(10, 5);
    public int minDiffInBST(TreeNode root) {
        if (root.left != null) {
            minDiffInBST(root.left);
        }
        min = Math.min(min, Math.abs(root.val - prev));
        prev = root.val;
        if (root.right != null) {
            minDiffInBST(root.right);
        }
        return min;
    }

    public class TreeNode {
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
