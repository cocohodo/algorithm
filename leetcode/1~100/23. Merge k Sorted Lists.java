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
        if(lists == null || lists.length == 0) return null;
        return getMid(lists, 0, lists.length - 1); 
    }
    private ListNode getMid(ListNode lists[], int start, int end){
        if(start == end) return lists[start];
        int mid = start + (end - start) / 2; 
        ListNode left = getMid(lists, start, mid); 
        ListNode right = getMid(lists, mid + 1, end); 
        return merge(left, right);
    }
    public ListNode merge(ListNode list1, ListNode list2) {
        ListNode result = new ListNode(0); 
        ListNode curr = result;        
        while(list1 != null && list2 != null){
            if(list1.val < list2.val){ 
                curr.next  = list1;
                list1 = list1.next;
            }
            else{
                curr.next = list2;
                list2 = list2.next;
            }
            curr = curr.next;
        }
        if(list1 == null)
            curr.next = list2; 
        else if(list2 == null)
            curr.next = list1;     
        return result.next; 
    }
}