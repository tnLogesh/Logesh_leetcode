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
    void reverse(TreeNode l,TreeNode r,int c){
        if(l==null||r==null)return;
        if(c%2==0){
            int n=l.val;
            l.val=r.val;
            r.val=n;
        }
        reverse(l.left,r.right,c+1);
        reverse(l.right,r.left,c+1);
    }
    public TreeNode reverseOddLevels(TreeNode root) {
        if(root==null)return root;
        reverse(root.left,root.right,0);
        return root;
    }
}