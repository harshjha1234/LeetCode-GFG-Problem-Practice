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
        PriorityQueue<ListNode> heap = new PriorityQueue<>(Comparator.comparingInt(node -> node.val));
        for (ListNode node : lists) {
            if (node != null) {
                heap.offer(node);
            }
        }
        // Create a dummy node and a pointer to it
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        // Process the heap until it is empty
        while (!heap.isEmpty()) {
            // Extract the minimum element from the heap
            ListNode node = heap.poll();
            curr.next = node;
            curr = curr.next;
            if (node.next != null) {
                // If the extracted node has a next node, insert it into the heap
                heap.offer(node.next);
            }
        }
        return dummy.next;
    }
}
