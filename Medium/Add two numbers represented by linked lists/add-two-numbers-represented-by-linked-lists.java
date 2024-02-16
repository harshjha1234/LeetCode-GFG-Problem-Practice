//{ Driver Code Starts
// driver

import java.util.*;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class GfG{
    
    static void printList(Node n){
        while(n!=null){
            System.out.print(n.data+" ");
            n = n.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while (T-- > 0) {
            
            int n = sc.nextInt();
            int val = sc.nextInt();
            
            Node first = new Node(val);
            Node tail = first;
            for(int i=0; i<n-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            int m = sc.nextInt();
            val = sc.nextInt();
            
            Node second = new Node(val);
            tail = second;
            for(int i=0; i<m-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            Solution g = new Solution();
            Node res = g.addTwoLists(first, second);
            printList(res);
        }
    }
}

// } Driver Code Ends


/* node for linked list

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

*/

class Solution{
    //Function to add two numbers represented by linked list.
    static Node addTwoLists(Node first, Node second){
        // code here
        // return head of sum list
        first = reverseList(first);
        second = reverseList(second);
        Node res = null, cur1 = first, cur2 = second, cur = null;
        int carry = 0;
        while (cur1 != null && cur2 != null) {
            int sum = cur1.data + cur2.data + carry;
            Node n = new Node(sum % 10);
            carry = sum / 10;
            if (res == null) {
                res = cur = n;
            }
            else {
                cur.next = n;
                cur = cur.next;
            }
            cur1 = cur1.next;
            cur2 = cur2.next;
        }
        while (cur1 != null) {
            int sum = cur1.data + carry;
            Node n = new Node(sum % 10);
            carry = sum / 10;
            cur.next = n;
            cur = cur.next;
            cur1 = cur1.next;
        }
        while (cur2 != null) {
            int sum = cur2.data + carry;
            Node n = new Node(sum % 10);
            carry = sum / 10;
            cur.next = n;
            cur = cur.next;
            cur2 = cur2.next;
        }
        if (carry > 0) {
            Node n = new Node(carry);
            cur.next = n;
        }
        return reverseList(res);
    }
    
    static Node reverseList(Node head) {
        if (head.next == null) return head;
        Node temp = head.next;
        Node newHead = reverseList(temp);
        temp.next = head;
        head.next = null;
        return newHead;
    }
}