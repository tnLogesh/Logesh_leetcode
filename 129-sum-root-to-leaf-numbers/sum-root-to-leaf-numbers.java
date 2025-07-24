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
    private int sumOf(TreeNode cur,int sum){
        if(cur==null)return 0;
        sum=sum*10+cur.val;
        if(cur.left==null&&cur.right==null)return sum;
        return sumOf(cur.left,sum)+sumOf(cur.right,sum);

    }
    public int sumNumbers(TreeNode root) {
        return sumOf(root,0);
    }
}