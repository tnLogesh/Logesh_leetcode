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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head1=l1;
        ListNode head2=l2;
        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;
        int c=0;
        while(head1!=null||head2!=null||c==1){
            int n1=0;
            int n2=0;
            if(head1!=null){
                n1=head1.val;
                head1=head1.next;
            }
            if(head2!=null){
                n2=head2.val;
                head2=head2.next;
            }
            int sum=n1+n2+c;
            c=sum/10;
            ListNode t=new ListNode(sum%10);
            temp.next=t;
            temp=temp.next;
        }
        return dummy.next;
    }
}