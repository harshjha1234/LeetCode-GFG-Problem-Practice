//{ Driver Code Starts
import java.io.*;
import java.util.*;
class Node
{
    int data;
    Node next;
    
    Node(int x)
    {
        data = x;
        next = null;
    }
}
class GfG
{
    public static void printList(Node node) 
    { 
        while (node != null)
        { 
            System.out.print(node.data);
            node = node.next; 
        }  
        System.out.println();
    } 
    public static void main(String args[])throws IOException
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String s = sc.next();
                    Node head = new Node( s.charAt(0) - '0' );
                    Node tail = head;
                    for(int i=1; i<s.length(); i++)
                    {
                        tail.next = new Node( s.charAt(i) - '0' );
                        tail = tail.next;
                    }
                    Solution obj = new Solution();
                    head = obj.addOne(head);
                    printList(head); 
                }
        }
}
// } Driver Code Ends


/*
class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
} 
*/

class Solution
{
    static int helper(Node head)
    {
        if(head==null)
        return 1;
        int carry = helper(head.next);
        head.data = head.data+carry;
        if(head.data<10)
        return 0;
        else
        {
            head.data=0;
            return 1;
        }
    }
    public static Node addOne(Node head) 
    { 
        //code here.
        int carry = helper(head);
        if(carry==1)
        {
            Node newNode = new Node(1);
            newNode.next = head;
            return newNode;
        }
        return head;
    }
}
