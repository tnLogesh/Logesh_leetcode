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
    public ListNode modifiedList(int[] nums, ListNode head) {
        ListNode temp=head;
        Set<Integer>s=new HashSet<>();
        for(int i:nums){
            s.add(i);
        }
        while(s.contains(head.val)){
            head=head.next;
        }
        temp=head;
        ListNode prev=head;
        while(temp!=null){
            if(s.contains(temp.val)){
                prev.next=temp.next;
            }
            else prev=temp;
            temp=temp.next;
        }
        return head;
    }
}