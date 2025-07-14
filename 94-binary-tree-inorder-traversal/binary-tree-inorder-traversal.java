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
    List<Integer> io(TreeNode cur,List<Integer>l){
        if(cur!=null){
            io(cur.left,l);
            l.add(cur.val);
            io(cur.right,l);
        }
        return l;
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        return io(root,new ArrayList<Integer>());
    }
}