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
    int count=0;
    void dfs(TreeNode root){
        if(root!=null){
            dfs(root.left);
            count++;
            dfs(root.right);
        }
    }
    public int countNodes(TreeNode root) {
        dfs(root);
        return count;
    }
}