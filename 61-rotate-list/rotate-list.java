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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode temp=head;
        if(head==null||head.next==null){
            return head;
        }
        int c=0;
        while(temp!=null){
            c++;
            temp=temp.next;
        }
        int n=k%c;
        int count=0;
        while(n>0){
            temp=head;
            count=1;
            while(c>count+1){
                count++;
                temp=temp.next;
            }
            ListNode newList=temp.next;
            temp.next=null;
            newList.next=head;
            head=newList;
            n--;
        }
        return head;
    }
}