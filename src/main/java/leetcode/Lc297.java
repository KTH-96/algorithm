package leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class Lc297 {
    public class TreeNode {
        int val;

     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
    }

    public class Codec {
        // Encodes a tree to a single string.
        public String serialize(TreeNode root) {
            if (root == null) {
                return " ";
            }
            StringBuilder sb = new StringBuilder();
            Queue<TreeNode> q = new LinkedList<>();
            q.offer(root);

            while (!q.isEmpty()) {
                TreeNode node = q.poll();
                if (node == null) {
                    sb.append("n ");
                    continue;
                }
                sb.append(node.val + " ");
                q.offer(node.left);
                q.offer(node.right);
            }
            return sb.toString();
        }

        // Decodes your encoded data to tree.
        public TreeNode deserialize(String data) {
            if (data.isBlank()) {
                return null;
            }

            String[] tree = data.split(" ");
            TreeNode root = new TreeNode(Integer.parseInt(tree[0]));
            Queue<TreeNode> q = new LinkedList<>();
            q.offer(root);
            int index = 1;
            while (!q.isEmpty()) {
                TreeNode parent = q.poll();
                if (!tree[index].equals("n")) {
                    parent.left = new TreeNode(Integer.parseInt(tree[index]));
                    q.offer(parent.left);
                }
                index++;
                if (!tree[index].equals("n")) {
                    parent.right = new TreeNode(Integer.parseInt(tree[index]));
                    q.offer(parent.right);
                }
                index++;
            }
            return root;
        }
    }
}
