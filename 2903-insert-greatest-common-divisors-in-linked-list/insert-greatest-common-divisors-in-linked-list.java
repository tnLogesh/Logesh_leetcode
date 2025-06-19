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
    static int gcdOf(int a,int b){
    if(b==0){
        return a;
    }
    return gcdOf(b,a%b);
}
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode curr=head;
        ListNode next1=curr.next;
        while(next1!=null){
            ListNode temp=new ListNode(gcdOf(curr.val,next1.val));
            temp.next=next1;
            curr.next=temp;
            curr=curr.next.next;
            next1=next1.next;
        }
        return head;
    }
}