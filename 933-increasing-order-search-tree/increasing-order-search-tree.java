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
    TreeNode t=new TreeNode(-1);
    TreeNode cur=t;
    public TreeNode increasingBST(TreeNode root) {
        if(root!=null){
            increasingBST(root.left);
            cur.right=new TreeNode(root.val);
            cur=cur.right;
            increasingBST(root.right);
        }
        return t.right;
    }
}