/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    private void toList(ListNode head,List<Integer>l){
        while(head!=null){
            l.add(head.val);
            head=head.next;
        }
    }
    public TreeNode sortedListToBST(ListNode head) {
        List<Integer>node=new ArrayList<>();
        toList(head,node);
        return buildBalBST(node,0,node.size()-1);
    }
}