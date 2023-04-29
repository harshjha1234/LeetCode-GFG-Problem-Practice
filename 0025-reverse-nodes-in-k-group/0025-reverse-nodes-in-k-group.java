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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null || k==1) {
            return head;
        }

        ListNode d = new ListNode();
        d.next = head;

        ListNode c = d,nex = d,p = d;

        int count=0;
        while(c.next!=null){
            c = c.next;         
            count++;
        }

        while(count>=k){                 
            c = p.next;            
            nex = c.next;           
            for(int i=1;i<k;i++){        
                c.next = nex.next;
                nex.next = p.next;
                p.next = nex;
                nex = c.next;
            }
            p = c;   
            count-=k;                   
        }
        return d.next;
    }
}