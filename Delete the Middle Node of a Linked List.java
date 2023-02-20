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
    public ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next == null){
            return null;
        }
        ListNode hare = head;
        ListNode turtle = head;
        ListNode prev = head;
        while(hare !=null && hare.next != null){
            prev = turtle; 
            hare = hare.next.next;
            turtle = turtle.next;
        }
        prev.next = turtle.next;
        return head;
    }
}
