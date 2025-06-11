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
    public ListNode middleNode(ListNode head) {
        ListNode low=head;
        ListNode high=head;
        while(high.next!=null&&high.next.next!=null){
            low=low.next;
            high=high.next.next;
        }
        if(high.next==null){
            return low;
        }
        return low.next;
    }
}