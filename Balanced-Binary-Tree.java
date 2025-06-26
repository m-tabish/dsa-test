/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public boolean isBalanced(TreeNode root) {
        int result = count(root);
        return result != -1;
    }

    private int count(TreeNode root) {
        if (root == null)
            return 0;
        int l = count(root.left);
        int r = count(root.right);
        int result = Math.abs(l - r);
        if (result > 1 || l == -1 || r == -1) {
            return -1;
        }
        return 1 + Math.max(l, r);
    }
}