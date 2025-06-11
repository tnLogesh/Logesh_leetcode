/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode low=head;
        ListNode high=head;
        if(head==null){
            return false;
        }
        while(high.next!=null&&high.next.next!=null){
            low=low.next;
            high=high.next.next;
            if(low==high){
                return true;
            }
        }
        return false;
    }
}