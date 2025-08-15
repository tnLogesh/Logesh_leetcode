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
    public ListNode reverseKGroup(ListNode head, int k) {
        List<Integer>l=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            l.add(temp.val);
            temp=temp.next;
        }
        ListNode dummy=new ListNode(-1);
        temp=dummy;
        int n=l.size()%k;
        //System.out.println(n);
        for(int i=0;i<l.size()-n;i+=k){
            for(int j=i+k-1;j>=i;j--){
                temp.next=new ListNode(l.get(j));
                //System.out.print(l.get(j)+" ");
                temp=temp.next;
            }
        }
        int j=l.size()-n;
        for(int i=j;i<l.size();i++){
            temp.next=new ListNode(l.get(i));
            temp=temp.next;
            //System.out.print(l.get(i)+" ");
        }
        return dummy.next;
    }
}