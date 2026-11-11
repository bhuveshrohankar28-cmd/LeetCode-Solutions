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
    public ListNode oddEvenList(ListNode head) {
        ListNode dummy1 = new ListNode(-1);
        ListNode dummy2 = new ListNode(-1);
        ListNode temp1 = dummy1;
        ListNode temp2 = dummy2;
        ListNode curr = head;
        boolean flag = true;
        while(curr!=null){
            if(flag){
                temp1.next=curr;
                temp1=temp1.next;
                flag=false;
            }else{
                temp2.next=curr;
                temp2=temp2.next;
                flag=true;
            }
            curr=curr.next;
        }
        temp2.next=null;
        temp1.next=dummy2.next;
        return dummy1.next;
    }
}
