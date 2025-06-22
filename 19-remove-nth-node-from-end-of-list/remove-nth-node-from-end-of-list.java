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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=head;
        ListNode tail=null;
        int c=0;
        while(temp!=null){
            c++;
            temp=temp.next;
        }
        //System.out.println(c);
        if(c==1){
            return tail;
        }
        temp=head;
        if(c==n){
            return head.next;
        }
        c=c-n;
        int count=1;
        while(temp!=null){
            if(count==c){
                //System.out.print(temp.val);
                temp.next=temp.next.next;
            }
            else{
                temp=temp.next;
            }
            count++;
        }
        return head;
    }
}