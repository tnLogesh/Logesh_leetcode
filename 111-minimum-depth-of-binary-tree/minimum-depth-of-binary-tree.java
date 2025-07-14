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
    public int minDepth(TreeNode root) {
        int n,d=0;
        if(root==null){
            return 0;
        }
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            d++;
            n=q.size();
            for(int i=0;i<n;i++){
                TreeNode a=q.poll();
                if(a.left==null&&a.right==null)return d;
                if(a.left!=null)q.add(a.left);
                if(a.right!=null)q.add(a.right);
            }
        }
        return d;
    }
}