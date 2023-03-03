/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head ==null) return false;
        ListNode turtle=head;
        ListNode hare=head;
        
        while(hare.next!=null && hare.next.next!=null){
            turtle=turtle.next;
            hare=hare.next.next;
            
            if(turtle==hare){
                return true;
            }
        }
        return false;
    }
}
