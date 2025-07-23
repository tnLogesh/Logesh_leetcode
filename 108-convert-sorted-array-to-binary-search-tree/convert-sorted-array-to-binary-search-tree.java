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
    public TreeNode buildBalBST(int[]arr,int start,int end){
        if(start>end)return null;
        int mid=start+(end-start)/2;
        TreeNode root=new TreeNode(arr[mid]);
        root.left=buildBalBST(arr,start,mid-1);
        root.right=buildBalBST(arr,mid+1,end);
        return root;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        return buildBalBST(nums,0,nums.length-1);
    }
}