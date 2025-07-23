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
    public TreeNode buildBalBST(List<Integer>node,int start,int end){
        if(start>end)return null;
        int mid=start+(end-start)/2;
        TreeNode root=new TreeNode(node.get(mid));
        root.left=buildBalBST(node,start,mid-1);
        root.right=buildBalBST(node,mid+1,end);
        return root;
    }
    private void inOrder(TreeNode root,List<Integer>l){
        if(root!=null){
            inOrder(root.left,l);
            l.add(root.val);
            inOrder(root.right,l);
        }
    }
    public TreeNode balanceBST(TreeNode root) {
        List<Integer>node=new ArrayList<>();
        inOrder(root,node);
        return buildBalBST(node,0,node.size()-1);
    }
}