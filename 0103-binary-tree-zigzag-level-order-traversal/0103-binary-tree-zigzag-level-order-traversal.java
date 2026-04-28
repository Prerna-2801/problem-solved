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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if(root == null) return list;
        Deque<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int h = 0;
        while(!q.isEmpty()){
            int len = q.size();
            list.add(new ArrayList<>());
            for(int  i = 0 ;i<len; i++){
                if(h % 2 == 0){
                    TreeNode node = q.poll();
                    list.get(h).add(node.val);
                    if(node.left != null) q.offer(node.left);
                    if(node.right != null) q.offer(node.right);
                }
                else{
                    TreeNode node  = q.pollLast();
                    list.get(h).add(node.val);
                    if(node.right != null) q.offerFirst(node.right);
                    if(node.left != null) q.offerFirst(node.left);
                }
            }
            h++;
        }
        return list;
    }
}