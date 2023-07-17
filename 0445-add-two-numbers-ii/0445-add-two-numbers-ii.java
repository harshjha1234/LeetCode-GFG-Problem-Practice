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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1=reverse(l1);
        l2=reverse(l2);
        ListNode node = new ListNode();
        int sum=0;
        int carry = 0;
        while(l1!=null || l2!=null){
            if(l1!=null) sum+=l1.val;
            if(l2!=null) sum+=l2.val;
            node.val = sum%10;
            carry = sum/10;
            ListNode temp = new ListNode(carry);
            sum = carry;
            temp.next = node;
            node = temp;
            l1 = l1!=null? l1.next : null;
            l2 = l2!=null? l2.next : null;
        }
        return carry== 0 ? node.next:node;
    }
    private ListNode reverse(ListNode head){
        if(head==null || head.next==null) return head;
        ListNode prev = null;
        ListNode cur = head;
        ListNode next = null;
        while(cur!=null){
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        head = prev;
        return head;
    }
}