//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0)
        {
            String wild = in.readLine();
            String pattern = in.readLine();
            
            Solution ob = new Solution();
            boolean flag = ob.match(wild, pattern);
            if(flag)
            System.out.println("Yes");
            else
            System.out.println("No");
        }
    }
}
// } Driver Code Ends




//User function Template for Java

class Solution{
    static boolean solve(int i,int j,String wild,String pat,boolean dp[][]){
        if(i<0 && j<0) return true;
        if(i<0 && j>=0) return false;
        if(j<0 && i>=0){
            for(int k = 0;k<=i;k++){
                if(wild.charAt(k)!='*') return false;
            }
            return true;
        }
        if(dp[i][j]) return true;
        if(wild.charAt(i)==pat.charAt(j) || wild.charAt(i)=='?'){
            return dp[i][j] = solve(i-1,j-1,wild,pat,dp);
        }
        if(wild.charAt(i)=='*'){
            return dp[i][j] = solve(i,j-1,wild,pat,dp) || solve(i-1,j,wild,pat,dp);
        }
        return dp[i][j] = false;
    }
    static boolean match(String wild, String pattern)
    {
        // code here
        int n = wild.length();
        int m = pattern.length();
        boolean dp[][] = new boolean[n][m];
        return solve(n-1,m-1,wild,pattern,dp);
    }
}