//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.countFriendsPairings(n));
                }
        }
}    
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public long countFriendsPairings(int n) 
    { 
       //code here
       long dp[] = new long[n+1];
       Arrays.fill(dp,-1);
       dp[0] = 1;
       for(int i=1;i<=n;i++){
       long single = dp[i-1];
       long pair = 0;
       if(i - 2 >= 0){
           pair = dp[i-2] * (i - 1);
       }
         dp[i] = (single + pair) % 1000000007;
       }
       return dp[n];
    }
}    
 