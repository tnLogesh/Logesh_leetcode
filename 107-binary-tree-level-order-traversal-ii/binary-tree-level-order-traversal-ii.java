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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        List<List<Integer>> l=new ArrayList<>();
        if(root==null){
            return l;
        }
        q.add(root);
        while(!q.isEmpty()){
            List<Integer> l1=new ArrayList<>();
            int n=q.size();
            for(int i=0;i<n;i++){
                TreeNode a=q.poll();
                l1.add(a.val);
                if(a.left!=null)q.add(a.left);
                if(a.right!=null)q.add(a.right);
            }
            l.add(l1);
        }
        List<List<Integer>>l1=new ArrayList<>();
        for(int i=l.size()-1;i>=0;i--){
            l1.add(l.get(i));
        }
        return l1;
    }
}