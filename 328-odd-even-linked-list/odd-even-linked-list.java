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
    public ListNode oddEvenList(ListNode head) {
        int ind=1;
        ListNode odd=new ListNode();
        ListNode oddTemp=odd;
        ListNode even=new ListNode();
        ListNode evenTemp=even;
        while(head!=null){
            if(ind%2==0){
                evenTemp.next=new ListNode(head.val);
                evenTemp=evenTemp.next;
            }
            else{
                oddTemp.next=new ListNode(head.val);
                oddTemp=oddTemp.next;
            }
            ind++;
            head=head.next;
        }
        oddTemp.next=even.next;
        return odd.next;
    }
}