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
    int rd=0;
    int ld=0;
    int depth(TreeNode cur){
        if(cur==null){
            return 0;
        }
        return 1+Math.max(depth(cur.left),depth(cur.right));
    }
    public boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }
        rd=depth(root.right);
        ld=depth(root.left);
        if(Math.abs(rd-ld)>1)return false;
        return isBalanced(root.left)&&isBalanced(root.right);
    }
}