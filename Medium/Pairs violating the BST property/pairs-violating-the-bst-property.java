//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }

    public static Node buildTree(String str) {
        // Corner Case
        if (str.length() == 0 || str.charAt(0) == 'N') return null;

        // Creating array of Strings from input
        // String after spliting by space
        String ip[] = str.split(" ");

        // Create the root of the tree
        Node root = new Node(Integer.parseInt(ip[0]));

        // Push the root to the queue
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        // Starting from the second element
        int i = 1;
        while (queue.size() > 0 && i < ip.length) {

            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();

            // Get the current node's value from the string
            String currVal = ip[i];

            // If the left child is not null
            if (!currVal.equals("N")) {

                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }

            // For the right child
            i++;
            if (i >= ip.length) break;

            currVal = ip[i];

            // If the right child is not null
            if (!currVal.equals("N")) {

                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));

                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }

        return root;
    }

    public static Node inputTree(BufferedReader br) throws IOException {
        return buildTree(br.readLine().trim());
    }

    public static void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            int n;
            n = Integer.parseInt(br.readLine());

            Node root = Node.inputTree(br);

            Solution obj = new Solution();
            int res = obj.pairsViolatingBST(n, root);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends


/*

Definition for Binary Tree Node
class Node
{
    int data;
    Node left;
    Node right;

    Node(int data)
    {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    static int  i=0;
    static int  count=0;
    public static int pairsViolatingBST(int n, Node root) {
        // code here
        int[] arr=new int[n];
        i=0;
        count=0;
        inOrder(root,arr);
        mergeSort(arr,n,0,n-1);
        return count;
    }
    
    public static void inOrder(Node root,int[] arr){
        if(root==null){
            return ;
        }
        
        inOrder(root.left,arr);
        arr[i]=root.data;
        i++;
        inOrder(root.right,arr);
        
        
    }
    
    public static void mergeSort(int[] arr,int n,int f,int l)
    {
        if(f==l){
            return ;
        }
        
        int mid=(f+l)/2;
        
        mergeSort(arr,n,f,mid);
        mergeSort(arr,n,mid+1,l);
        merge(arr,n,f,mid,l);
    }
    
    public static void merge(int arr[],int n,int f,int mid,int l){
        
        int fs=mid-f+1;
        int ss=l-mid;
        
        int x;
        int y;
        
        int fa[]=new int[fs];
        int sa[]=new int[ss];
        
        for(x=0;x<fs;x++){
           fa[x]=arr[x+f]; 
        }
        
        for(y=0;y<ss;y++){
            sa[y]=arr[y+mid+1];
        }
        
        x=0;
        y=0;
        
        while(x<fs && y<ss){
            if(fa[x]<=sa[y]){
                arr[f+x+y]=fa[x];
                x++;
            }else{
                
                count+=fs-x;
                arr[f+x+y]=sa[y];
                y++;
            }
        }
        
        while(x<fs)
        {
            arr[f+x+y]=fa[x];
            x++;
           
        }
        while(y<ss){
            arr[f+x+y]=sa[y];
            y++;
            
        }
    }
}
