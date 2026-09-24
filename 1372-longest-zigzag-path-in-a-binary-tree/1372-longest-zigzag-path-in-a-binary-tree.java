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
    int maxPath = 0;
    public int longestZigZag(TreeNode root) {
        if(root.left == null && root.right == null) return 0;
        f(root.left, true, 1);
        f(root.right, false, 1);
        return maxPath;
    }
    public void f(TreeNode node, boolean isLeft, int currLen){
        if(node == null) return;
        maxPath = Math.max(maxPath, currLen);
        if(isLeft){
            f(node.left, true, 1);
        }
        else{
            f(node.left, true, currLen+1);
        }
        if(!isLeft){
            f(node.right, false, 1);
        }
        else{
            f(node.right, false, currLen+1);
        }
    }
}