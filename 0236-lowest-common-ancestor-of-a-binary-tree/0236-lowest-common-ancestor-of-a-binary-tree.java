/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) return null;
        if(p == root || q == root) return root;
        TreeNode leftH = lowestCommonAncestor(root.left, p, q);
        TreeNode rightH = lowestCommonAncestor(root.right, p, q);
        if(leftH != null && rightH != null) return root;
        return leftH != null ? leftH : rightH;
    }
}