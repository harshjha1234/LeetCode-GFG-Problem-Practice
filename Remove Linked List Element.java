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
    public ListNode removeElements(ListNode head, int val) {
        if(head == null){
            return null;
        }
        
        ListNode prev = new ListNode();
        prev.next = head;
        ListNode curr = prev;
        while(curr.next != null){
            // prev = curr;
            if(curr.next.val == val){
              curr.next = curr.next.next;
            }else{
              curr = curr.next;
            }
        }
        return prev.next;
    }
}
