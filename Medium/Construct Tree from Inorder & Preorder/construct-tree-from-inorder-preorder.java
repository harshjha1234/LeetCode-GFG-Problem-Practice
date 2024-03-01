//{ Driver Code Starts
import java.util.*;
import java.io.*;
class Node
{
    int data; 
    Node left, right;
    Node(int key)
    {
        data = key;
        left = right = null;
    }
}

class GFG
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            Node root = null;
            int inorder[] = new int[n];
            int preorder[] = new int[n];
            for(int i = 0; i < n; i++)
              inorder[i] = sc.nextInt();
              
            for(int i = 0; i < n; i++)
              preorder[i] = sc.nextInt();
              
            Solution ob = new Solution();
            root = ob.buildTree(inorder, preorder, n);
            postOrdrer(root);
            System.out.println();
        }
    }
    
    public static void postOrdrer(Node root)
    {
        if(root == null)
          return;
          
        postOrdrer(root.left);
        postOrdrer(root.right);
        System.out.print(root.data + " ");
    }
}
// } Driver Code Ends


class Solution
{
    public static Node buildTree(int inorder[], int preorder[], int n)
    {
        // code here
        return binaryTree(inorder,preorder,0,0,n-1);
    }
    public static Node binaryTree(int in[],int pre[],int preInd,int start,int end){
        if(start>end){
            return null;
        }
        Node root = new Node(pre[preInd]);
        int inInd = 0;
        for(int i = start;i<=end;i++){
            if(in[i] == root.data){
                inInd = i;
                break;
            }
        }
        root.left = binaryTree(in,pre,preInd+1,start,inInd-1);
        root.right = binaryTree(in,pre,preInd+1+inInd-start,inInd+1,end);
        return root;
    }
}
