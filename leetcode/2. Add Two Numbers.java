class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode sum = new ListNode(0);
        ListNode result = sum;
        boolean check1=true, check2=true; 
        while(check1||check2) {

            if (check1&&check2) sum.val += l1.val+l2.val;
            else if (check1) sum.val += l1.val;
            else if (check2) sum.val += l2.val;
            else sum.val += l1.val+l2.val;
            
            if(l1.next==null) check1 = false;
            if(l2.next==null) check2 = false;

            ListNode sum2 = new ListNode(0);
            if (sum.val>=10) {
                sum.val-=10;
                sum2.val += 1;
            }
            if (!check1&&!check2&&sum2.val==0) break;
            if(check1) l1=l1.next;
            if(check2) l2=l2.next;

            sum.next = sum2;
            sum = sum2;
        }
        return result;
    }
}