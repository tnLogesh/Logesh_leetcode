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
    public ListNode detectCycle(ListNode head) {
        List<ListNode>l=new ArrayList<>();
        if(head==null)return null;
        else if(head.next!=null){
        ListNode temp=head.next;
        l.add(head);
        while(temp!=null){
            if(l.contains(temp)){
                for(int i=0;i<l.size();i++){
                    if(l.get(i)==temp)return temp;
                }
            }
            l.add(temp);
            temp=temp.next;
        }
        }
        return null;
    }
}