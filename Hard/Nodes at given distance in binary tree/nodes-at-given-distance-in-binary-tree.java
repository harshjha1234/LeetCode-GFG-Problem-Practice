//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class Node  
{ 
    int data; 
    Node left, right; 
   
    public Node(int d)  
    { 
        data = d; 
        left = right = null; 
    } 
}

class GFG
{
    static Node buildTree(String str)
    {
        // Corner Case
        if(str.length() == 0 || str.equals('N'))
            return null;
        String[] s = str.split(" ");
        
        Node root = new Node(Integer.parseInt(s[0]));
        Queue <Node> q = new LinkedList<Node>();
        q.add(root);
        
        // Starting from the second element
        int i = 1;
        while(!q.isEmpty() && i < s.length)
        {
              // Get and remove the front of the queue
              Node currNode = q.remove();
        
              // Get the current node's value from the string
              String currVal = s[i];
        
              // If the left child is not null
              if(!currVal.equals("N")) 
              {
        
                  // Create the left child for the current node
                  currNode.left = new Node(Integer.parseInt(currVal));
        
                  // Push it to the queue
                  q.add(currNode.left);
              }
        
              // For the right child
              i++;
              if(i >= s.length)
                  break;
              currVal = s[i];
        
              // If the right child is not null
              if(!currVal.equals("N")) 
              {
        
                  // Create the right child for the current node
                  currNode.right = new Node(Integer.parseInt(currVal));
        
                  // Push it to the queue
                  q.add(currNode.right);
              }
              
              i++;
        }
    
        return root;
    }
    
    public static void main(String args[]) throws IOException
    {
    
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t>0)
        {
            String s = br.readLine().trim();
            Node root = buildTree(s);
            Solution T = new Solution();
            int target = Integer.parseInt(br.readLine().trim());
            int k = Integer.parseInt(br.readLine().trim());
            ArrayList<Integer> res = new ArrayList<Integer>();
            res = T.KDistanceNodes(root,target,k);
            for(int i = 0;i<res.size();i++)
                System.out.print(res.get(i) + " ");
            System.out.println();    
            t--;
        }
    }
}

// } Driver Code Ends


//User function Template for Java

// class Node  
// { 
//     int data; 
//     Node left, right;
// }

class Solution
{
    public static ArrayList<Integer> KDistanceNodes(Node root, int target , int k)
    {
        // return the sorted list of all nodes at k dist
        Map<Node, Node> parent = new HashMap<>();
        populateParentMap(parent, root); // Populate parent map using DFS or BFS
        
        Queue<Node> queue = new LinkedList<>();
        Map<Node, Boolean> visited = new HashMap<>();
        visited.put(findNode(root, target), true);
        queue.offer(findNode(root, target));
        int level = 0;
        
        while (!queue.isEmpty()) {
            int size = queue.size();
            if (level == k) break;
            level++;
            
            while (size-- > 0) {
                Node curr = queue.poll();
                Node left = curr.left;
                Node right = curr.right;
                
                if (left != null && !visited.containsKey(left)) {
                    visited.put(left, true);
                    queue.offer(left);
                }
                
                if (right != null && !visited.containsKey(right)) {
                    visited.put(right, true);
                    queue.offer(right);
                }
                
                Node parentNode = parent.get(curr);
                if (parentNode != null && !visited.containsKey(parentNode)) {
                    visited.put(parentNode, true);
                    queue.offer(parentNode);
                }
            }
        }
        
        ArrayList<Integer> result = new ArrayList<>();
        while (!queue.isEmpty()) {
            result.add(queue.poll().data);
        }
        
        Collections.sort(result);
        return result;
    }
    
    private static void populateParentMap(Map<Node, Node> parent, Node root) {
        if (root == null) return;
        
        if (root.left != null) {
            parent.put(root.left, root);
            populateParentMap(parent, root.left);
        }
        
        if (root.right != null) {
            parent.put(root.right, root);
            populateParentMap(parent, root.right);
        }
    }
    
    private static Node findNode(Node root, int target) {
        if (root == null || root.data == target) {
            return root;
        }
        
        Node left = findNode(root.left, target);
        if (left != null) {
            return left;
        }
        
        return findNode(root.right, target);
    }
};