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

        // Dummy node helps handle swapping the first pair
        ListNode dummy = new ListNode(0, head);

        // Previous node before the pair being swapped
        ListNode prev = dummy;

        // Current node (first node of the pair)
        ListNode current = head;

        while (current != null && current.next != null) {

            // Store the node after the pair
            ListNode nextPair = current.next.next;

            // Second node of the current pair
            ListNode second = current.next;

            // Swap the two nodes
            second.next = current;
            current.next = nextPair;

            // Connect the previous node to the swapped pair
            prev.next = second;

            // Move prev to the end of the swapped pair
            prev = current;

            // Move current to the beginning of the next pair
            current = nextPair;
        }

        // Return the new head of the linked list
        return dummy.next;
    }
}
