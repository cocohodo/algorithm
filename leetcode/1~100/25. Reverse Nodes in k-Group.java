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
        if(head==null || head.next == null || k==1) return head;
        ListNode start = new ListNode(0,head);
        int length = 1;
        ListNode lpointer = head;
        //전체 리스트 길이 측정
        while(lpointer!=null) {
            length++;
            lpointer = lpointer.next;
        }
        //전체 포인터 배열 초기화
        ListNode[] pointer = new ListNode[length];
        lpointer = start;
        for(int i = 0;i<length;i++) {
            pointer[i] = lpointer;
            lpointer = lpointer.next;
        }
        //재귀시작 시작점부터 끝지점 지정 -> 양쪽 끝에서 1씩 줄여가며 뒤집기
        int count = 1;
        while(count+k-1<length) {
            reverse(count,count+k-1,pointer,k);
            count += k;
        }
        
        return start.next;
    }

    public void reverse(int start,int end,ListNode[] pointer,int k) {
        if(start>=end) return;
        //k가 2보다 큰 경우
        if(k>2&&end-start!=1){
            pointer[start-1].next = pointer[end];
            pointer[end-1].next = pointer[start];

            ListNode temp = pointer[start].next;
            pointer[start].next = pointer[end].next;
            pointer[end].next = temp;
            
            temp = pointer[end];
            pointer[end] = pointer[start];
            pointer[start] = temp;

            reverse(start+1,end-1,pointer,k);
        }
        //k가 2인 경우
        else {
            pointer[start-1].next = pointer[end];
            pointer[start].next = pointer[end].next;
            pointer[end].next = pointer[start];
            ListNode temp = pointer[end];
            pointer[end] = pointer[start];
            pointer[start] = temp;
        }

    }
}