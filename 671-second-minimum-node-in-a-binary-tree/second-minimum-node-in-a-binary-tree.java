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
    int min;
    long smin=Long.MAX_VALUE;
    public void tra(TreeNode cur){
        if(cur==null){
            return;
        }
        if(min>cur.val){
                smin=min;
                min=cur.val;
            }
            else if(cur.val>min&&smin>cur.val){
                smin=cur.val;
            }
            tra(cur.left);
            tra(cur.right);
    }
    public int findSecondMinimumValue(TreeNode root) {
        min=root.val;
        tra(root);
        return smin==Long.MAX_VALUE?-1:(int)smin;
    }
}