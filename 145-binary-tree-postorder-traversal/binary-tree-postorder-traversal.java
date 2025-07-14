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
    List<Integer> po(TreeNode cur,List<Integer>l){
        if(cur!=null){
            po(cur.left,l);
            po(cur.right,l);
            l.add(cur.val);
        }
        return l;
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        return po(root,new ArrayList<Integer>());
    }
}