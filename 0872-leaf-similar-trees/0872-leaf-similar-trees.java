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
    List<Integer> r1 = new ArrayList<>();
    List<Integer> r2 = new ArrayList<>();
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        f(root1, r1);
        f(root2, r2);
        if(r1.equals(r2)) return true;
        return false;
    }
    public void f(TreeNode node, List<Integer> list){
        if(node == null) return;
        if(node.left == null && node.right == null){
            list.add(node.val);
        }
        f(node.left, list);
        f(node.right, list);
    }
}