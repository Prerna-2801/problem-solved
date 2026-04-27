/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int max = 0;
    public int maxPathSum(TreeNode root) {
        max = Integer.MIN_VALUE;
        f(root);
        return max;
    }
    public int f(TreeNode root){
        if(root == null) return 0;
        int leftH = Math.max(0, f(root.left));
        int rightH = Math.max(0, f(root.right));
        int localSum = root.val + leftH + rightH;
        if(localSum > max) max = localSum;
        return root.val + Math.max(leftH, rightH);
    }
}