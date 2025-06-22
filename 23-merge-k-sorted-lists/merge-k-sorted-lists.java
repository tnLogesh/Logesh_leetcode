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
    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer>l=new ArrayList<>();
        int n=lists.length;
        for(int i=0;i<n;i++){
            ListNode head=lists[i];
            while(head!=null){
                l.add(head.val);
                head=head.next;
            }
        }
        Collections.sort(l);
        ListNode dummy=new ListNode(-1);
        ListNode curr=dummy;
        for(int i:l){
            ListNode temp=new ListNode(i);
            curr.next=temp;
            curr=temp;
        }
        return dummy.next;
    }
}