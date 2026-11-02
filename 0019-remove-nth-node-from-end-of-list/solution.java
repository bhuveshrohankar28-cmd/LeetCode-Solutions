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
        if(head.next==null) return head.next;
       ListNode slow=head; 
       ListNode fast=head;
       for(int i=1;i<n;i++){
        // if(fast==null) return head;
        fast=fast.next;
      }
      
       ListNode prev = slow;
       while(fast.next!=null){
        prev=slow;
        slow=slow.next;
        fast=fast.next;
      }
       if(slow==head) return head.next;
    //    if(prev.next==null) return head;
       prev.next=prev.next.next;
       return head;
    }
}
