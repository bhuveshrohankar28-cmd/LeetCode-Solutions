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
      ListNode slow=head;
      ListNode fast=head;
      ListNode temp=head;

      for(int i=1;i<=k;i++){
        temp = fast;
        fast=fast.next;
      }
      
      while(fast!=null){
        fast=fast.next;
        slow=slow.next;
      }
      int tempVal=temp.val;
      temp.val=slow.val;
      slow.val=tempVal;
      

      return head;
    }
}
