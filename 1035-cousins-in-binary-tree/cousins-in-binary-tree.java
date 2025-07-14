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
    public boolean isCousins(TreeNode root, int x, int y) {
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        boolean x1=false,y1=false;
        while(!q.isEmpty()){
            int n=q.size();
            for(int i=0;i<n;i++){
                TreeNode a=q.poll();
                if(a.left!=null){
                    q.add(a.left);
                }
                if(a.right!=null){
                    q.add(a.right);
                }
                if(a.left!=null&&a.right!=null){
                    if((a.right.val==x&&a.left.val==y)||(a.right.val==y&&a.left.val==x)){
                    return false;
                }
                }
                if(a.val==x)x1=true;
                if(a.val==y)y1=true;
            }
            if(x1&&y1)return true;
            if(x1||y1)return false;
        }
        return false;
    }
}