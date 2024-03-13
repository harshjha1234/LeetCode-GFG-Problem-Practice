//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String str = br.readLine().trim();
            Solution ob = new Solution();
            int ans = ob.LongestRepeatingSubsequence(str);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
     public static int longi(int x,String oni ){
        int dp[][]= new int[x+1][x+1]; // first row and first col toh puri zero ki hoti h na for that 
        for(int i= 1;i<=x;i++){
            for(int j=1;j<=x;j++){
                if(oni.charAt(i-1)==oni.charAt(j-1) && i!=j){
                    dp[i][j]=1+dp[i-1][j-1];
                }else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[x][x];
    }
    public int LongestRepeatingSubsequence(String str)
    {
        // code here
        int p = str.length();
        int result = longi(p,str);
        return result;
    }
}