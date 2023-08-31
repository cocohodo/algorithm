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
    public boolean isPalindrome(ListNode head) {
        Integer input[] = new Integer[50000];
        int loc=0,number=0;
        boolean check;
        ListNode head2 = head;
        while(true) {
            if(head2.next.next!=null) {
                head2 = head2.next.next;
                number+=2;
            }
            else if (head2.next==null){
                number++;
                break;
            }
            else {
                number+=2;
                break;
            }
            head2 = head2.next.next;
            number++;
        }
        number++;
        if (number % 2==0){
            check = true;
        }
        else check = false;

        for(loc=0;loc<number/2;loc++) {
            input[loc]=head.val;
            head = head.next;
        }
        if (check){
            for (int a=loc-1;a>=0;a--){
                if (head.val!=input[a]) return false;
                else {
                    if(head.next!=null) {head = head.next;}
                    else break;
                }
            }
        }
        else {
            head = head.next;
            for (int a=loc-1;a>=0;a--){
                if (head.val!=input[a]) return false;
                else {
                    if(head.next!=null) {head = head.next;}
                    else break;
                }
            }
        }
        return true;
    }
}