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
    public ListNode swapPairs(ListNode head) {

        ListNode dummy1 = new ListNode(-1);
        ListNode dummy2 = new ListNode(-1);

        ListNode temp1 = dummy1;
        ListNode temp2 = dummy2;

        ListNode curr = head;
        boolean flag = true;

        while (curr != null) {
            if (flag) {
                temp1.next = curr;
                temp1 = temp1.next;
            } else {
                temp2.next = curr;
                temp2 = temp2.next;
            }
            flag = !flag;
            curr = curr.next;
        }

        temp1.next = null;
        temp2.next = null;

        ListNode dummy3 = new ListNode(-1);
        ListNode tail = dummy3;

        ListNode temp3 = dummy1.next;
        ListNode temp4 = dummy2.next;

        while (temp3 != null || temp4 != null) {
            if (temp4 != null) {
                tail.next = temp4;
                tail = tail.next;
                temp4 = temp4.next;
            }
            if (temp3 != null) {
                tail.next = temp3;
                tail = tail.next;
                temp3 = temp3.next;
            }
        }
        tail.next = null;
        return dummy3.next;
    }
}
