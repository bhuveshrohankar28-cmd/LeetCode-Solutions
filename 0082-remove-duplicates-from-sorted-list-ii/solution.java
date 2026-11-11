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
    public ListNode deleteDuplicates(ListNode head) {
        // If list is empty or has only one node
        if (head == null || head.next == null) return head;
        // Create dummy node before head
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        // prev = last confirmed unique node
        ListNode prev = dummy;
        // cur = node currently being checked
        ListNode cur = head;

        while (cur != null && cur.next != null) {
            // Check if current node is duplicate
            if (cur.val == cur.next.val) {
                // Skip the entire duplicate group
                while (cur.next != null && cur.val == cur.next.val) {
                    cur = cur.next;
                }
                // Remove the duplicate group
                prev.next = cur.next;
            } else {
                // Current node is unique, keep it
                prev = prev.next;
            }
            // Move to the next node
            cur = cur.next;
        }
        // Return updated head
        return dummy.next;
    }
}
