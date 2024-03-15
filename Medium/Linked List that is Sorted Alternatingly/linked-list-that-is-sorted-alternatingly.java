//{ Driver Code Starts
/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class Node {
    int data;
    Node next;
    
    public Node (int data){
        this.data = data;
        this.next = null;
    }
}

class GFG {
    static void printList(Node node) 
	{ 
		while (node != null) 
		{ 
			System.out.print(node.data + " "); 
			node = node.next; 
		} 
		System.out.println(); 
	}
	public static void main (String[] args) {
		Scanner sc  = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		    int n = sc.nextInt();
		    
		    Node head = new Node(sc.nextInt());
		    Node tail = head;
		    
		    for(int i=1; i<n; i++){
		        tail.next = new Node(sc.nextInt());
		        tail = tail.next;
		    }
		    Solution obj = new Solution();
		    head = obj.sort(head);
		    printList(head);
		}
	}
}

// } Driver Code Ends



/*
class Node {
    int data;
    Node next;
    
    public Node (int data){
        this.data = data;
        this.next = null;
    }
}
*/

class Solution {
    
   public Node sort(Node head){
        //your code here, return the head of the sorted list
        if(head == null || head.next == null)return head;
        Node st = head;
        Node temp = st.next;
        while(temp != null){
            if(temp.data >= st.data){
                st = temp;
                temp = temp.next;
            }else{
                st.next = temp.next;
                Node prev = null;
                Node curr = head;
                while(curr != st && curr.data <= temp.data){
                    prev = curr;
                    curr = curr.next;
                }
                if(prev == null){
                    temp.next = head;
                    head = temp;
                }else{
                    temp.next = curr;
                    prev.next = temp;
                }
            }
            temp = st.next;
        }
        return head;
   }


}