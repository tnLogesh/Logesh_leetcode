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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[]arr={-1,-1};
        if(head.next.next==null){
            return arr;
        }
        ListNode prev=head;
        ListNode temp=head.next;
        int c=1;
        List<Integer>l=new ArrayList<>();
        while(temp.next!=null){
            if((temp.val>prev.val&&temp.val>temp.next.val)||
            (temp.val<prev.val&&temp.val<temp.next.val)){
                l.add(c);
            }
            prev=temp;
            temp=temp.next;
            c++;
        }
        if(l.size()<2){
            return arr;
        }
        // for(int i:l){
        //     System.out.print(i+" ");
        // }
        // arr[0]=Integer.MAX_VALUE;
        // for(int i=0;i<l.size()-1;i++){
        //     for(int j=i+1;j<l.size();j++){
        //         int n=Math.abs(l.get(i)-l.get(j));
        //         arr[1]=Math.max(arr[1],n);
        //         arr[0]=Math.min(arr[0],n);
        //     }
        // }
        Collections.sort(l);
        arr[1]=l.get(l.size()-1)-l.get(0);
        arr[0]=l.get(l.size()-1);
        for(int i=0;i<l.size()-1;i++){
            int num=l.get(i+1)-l.get(i);
            if(arr[0]>num){
                arr[0]=num;
                if(num==1)break;
            }
        }
        return arr;
    }
}