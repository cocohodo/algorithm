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
    public ListNode middleNode(ListNode head) {
        ListNode middle = head;
        for (int i=0;i<100;i++) {
            if(head.next==null) return middle;
            else if(head.next.next==null) {
                middle = middle.next;
                return middle;
            }
            else {
                head = head.next.next;
                middle = middle.next;
            }
        }
        return middle;
    }
}