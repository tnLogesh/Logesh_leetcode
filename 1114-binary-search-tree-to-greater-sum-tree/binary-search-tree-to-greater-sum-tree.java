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
    int a;
    void inOrder(TreeNode cur){
        if(cur!=null){
            inOrder(cur.right);
            a+=cur.val;
            cur.val=a;
            inOrder(cur.left);
        }
        return;
    }
    public TreeNode bstToGst(TreeNode root) {
        a=0;
        inOrder(root);
        return root;
    }
}