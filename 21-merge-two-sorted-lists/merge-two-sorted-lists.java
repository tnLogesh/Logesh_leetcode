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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null&&list2==null){
            return list1;
        }
        ListNode head=new ListNode(-99);
        ListNode merge=head;
        // merge=merge.next;
        while(list1!=null&&list2!=null){
            if(list1.val<=list2.val){
                
                merge.next=list1;
                list1=list1.next;
                merge=merge.next;
            }
            else{
                
                merge.next=list2;
                list2=list2.next;
                merge=merge.next;
                }
        }
        if(list1!=null){
            merge.next=list1;
            // merge=merge.next;
        }
        else{
            merge.next=list2;
            // merge=merge.next;
        }
        // while(head!=null){
        //     System.out.print(head.val+" ");
        //     head=head.next;
        // }
        return head.next;
    }
}