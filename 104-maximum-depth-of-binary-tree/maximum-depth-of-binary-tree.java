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
    int depth(TreeNode cur){
        if(cur==null)return 0;
            int l=depth(cur.left);
            int r=depth(cur.right);
            return 1+Math.max(l,r);
    }
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        return depth(root);
    }
}