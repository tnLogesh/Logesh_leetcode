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
    public ListNode swapNodes(ListNode head, int k) {
        int len = 0;
        ListNode temp = head;
        while (temp != null) {
            len++;
            temp = temp.next;
        }
        if (len == 1) return head;
        ListNode firstNode = head;
        for (int i = 1; i < k; i++) {
            firstNode = firstNode.next;
        }
        ListNode secondNode = head;
        for (int i = 1; i < len - k + 1; i++) {
            secondNode = secondNode.next;
        }
        int val = firstNode.val;
        firstNode.val = secondNode.val;
        secondNode.val = val;
        return head;
    }
}
