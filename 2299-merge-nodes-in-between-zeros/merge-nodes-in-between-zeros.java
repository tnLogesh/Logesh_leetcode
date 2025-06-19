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
class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode tail=head.next;
        ListNode dummy=new ListNode(-1);
        ListNode curr=dummy;
        while(tail!=null){
            int n=0;
            while(tail.val!=0){
                n+=tail.val;
                tail=tail.next;
            }
            //n+=tail.val;
            ListNode temp=new ListNode(n);
            curr.next=temp;
            curr=temp;
            tail=tail.next;
        }
        return dummy.next;
    }
}