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
        ListNode[] nth = new ListNode[31];
        int count = 0;
        ListNode pointer = head;
        while(pointer!=null) {
            nth[count++]=pointer;
            pointer = pointer.next;
        }
        if(count==1) {pointer = null; return pointer;}
        else if(count==n) {
            head = nth[1];
        }
        else {
            nth[count-n-1].next = nth[count-n+1];
        }
        return head;
    }
}