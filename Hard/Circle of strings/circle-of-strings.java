//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(in.readLine().trim());
		while(t-->0){
		    String A[] = in.readLine().trim().split(" ");
		    int N = Integer.parseInt(A[0]);
		    A = in.readLine().trim().split(" ");
		    
		    Solution ob = new Solution();
		    System.out.println(ob.isCircle(N, A));
		}
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution
{
    static int isCircle(int N, String A[])
    {
        // code here
        ArrayList<ArrayList<Integer>>adj = new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<26;i++)
        {
            adj.add(new ArrayList<Integer>());
        }
        int in[] = new int[26];
        int out[] = new int[26];
        
        for(int i=0;i<N;i++)
        {
            String temp = A[i];
            adj.get(temp.charAt(0)-'a').add(temp.charAt(temp.length()-1)-'a');
            out[temp.charAt(0)-'a']++;
            in[temp.charAt(temp.length()-1)-'a']++;
        }
        
        for(int i=0;i<26;i++)
        {
            if(in[i]!=out[i])return 0;
        }
        boolean vis[] = new boolean[26];
        dfs(adj,A[0].charAt(0)-'a',vis);
        for(int i=0;i<26;i++)
        {
            if(vis[i]==false && (in[i]!=0 || out[i]!=0))return 0;
        }
        return 1;
    }
    
    static void dfs(ArrayList<ArrayList<Integer>>adj,int ind,boolean vis[])
    {
        vis[ind] = true;
        for(int i:adj.get(ind))
        {
            if(vis[i]==false)
            {
                dfs(adj,i,vis);
            }
        }
    }
}