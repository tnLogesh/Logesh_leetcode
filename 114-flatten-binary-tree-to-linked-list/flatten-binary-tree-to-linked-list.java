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
    List<TreeNode>l=new LinkedList<>();
    public void preOrder(TreeNode root){
        if(root==null)return;
            l.add(root);
            preOrder(root.left);
            preOrder(root.right);
    }
    public void flatten(TreeNode root) {
        if(root==null)return;
        preOrder(root);
        for(int i=1;i<l.size();i++){
            TreeNode prev=l.get(i-1);
            TreeNode next=l.get(i);
            prev.left=null;
            prev.right=next;
        }
    }
}