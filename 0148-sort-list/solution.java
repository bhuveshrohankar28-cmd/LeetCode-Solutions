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
    public ListNode sortList(ListNode head) {
    if(head == null || head.next == null) return head;
        ListNode slow = head;
        ListNode fast = head;

        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode head2 = slow.next;
        slow.next=null;
        head = sortList(head);
        head2 = sortList(head2);
        return merge(head,head2);

    }public ListNode merge(ListNode head,ListNode head2){
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;

        while(head!=null && head2!=null){
            if(head.val<head2.val){
                temp.next=head;
                head=head.next;
            }else {
                temp.next=head2;
                head2=head2.next;
            }
            temp=temp.next;
        }
        if(head==null) temp.next=head2;
        else temp.next=head;
        return dummy.next;
    }
}
