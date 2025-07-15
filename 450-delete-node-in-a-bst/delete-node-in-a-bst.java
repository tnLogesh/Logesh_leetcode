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
    TreeNode delete(TreeNode cur,int data){
        if(cur==null){
            return null;
        }
        else if(data>cur.val){
            cur.right=delete(cur.right,data);
        }
        else if(data<cur.val){
            cur.left=delete(cur.left,data);
        }
        else{       //cur.val==data
            if(cur.left==null&&cur.right==null){
                return null;
            }
            else if(cur.left==null){
                return cur.right;
            }
            else if(cur.right==null){
                return cur.left;
            }
            else{
                TreeNode successor=findMin(cur.right);
                cur.val=successor.val;
                cur.right=delete(cur.right,successor.val);
            }
        }
        return cur;
    }
    private TreeNode findMin(TreeNode cur){
        while(cur.left!=null){
            cur=cur.left;
        }
        return cur;
    }
    public TreeNode deleteNode(TreeNode root, int key) {
        return delete(root,key);
    }
}