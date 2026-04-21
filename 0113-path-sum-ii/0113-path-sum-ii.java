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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null) return ans;
        f(root, ans, new ArrayList<>(), targetSum);
        return ans;
    }
    public void f(TreeNode root, List<List<Integer>> ans, List<Integer> path, int targetSum){
        if(root == null) return;
        path.add(root.val);
        if(root.left == null && root.right == null && root.val == targetSum){
            ans.add(new ArrayList<>(path));
        }
        else{
            f(root.left, ans, path, targetSum- root.val);
            f(root.right, ans, path, targetSum- root.val);
        }
        path.remove(path.size()-1);
    }
}