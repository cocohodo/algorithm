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
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode start = new ListNode(0,head);
        ListNode temp = new ListNode(0);
        ListNode prev = head;
        ListNode front = head.next;
        ListNode prev2 = start;

        while(front!=null) {
            prev2.next = front;
            temp = prev;
            prev.next = front.next;
            front.next = temp;

            if(front.next==null||front.next.next==null) break;
            prev2 = prev2.next.next;
            prev = prev2.next;
            front = prev.next;
        }

        return start.next;
    }
}