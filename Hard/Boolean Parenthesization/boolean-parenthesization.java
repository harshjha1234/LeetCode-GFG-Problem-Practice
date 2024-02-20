//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String S = in.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.countWays(N, S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int mod= 1003;
    static int countWays(int n, String s){
        // code here
        
        long[][][] dp = new long[n][n][2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                Arrays.fill(dp[i][j], -1);
            }
        }
        
        return (int)(f(0,n-1,s,1,dp))%mod;
    }
    static long f(int i,int j,String s,int isTrue,long dp[][][] ){
        if(i>j)return 0;
        
        if(i==j){
            if(isTrue==1){
               return  s.charAt(i)=='T'?1:0;
            }
            else{
                return s.charAt(i)=='F'?1:0;
            }
        }
        
        if (dp[i][j][isTrue] != -1) {
            return dp[i][j][isTrue];
        }
        long ways =0;
        for(int k=i+1;k<j;k+=2){
            long LT = f(i,k-1,s,1,dp);
            long RT = f(k+1,j,s,1,dp);
            long LF = f(i,k-1,s,0,dp);
            long RF = f(k+1,j,s,0,dp);
            if(s.charAt(k)=='&'){
               if(isTrue==1){
                    ways= (ways + (LT*RT)%mod )%mod;
               }
               else{
                   ways = (ways + (LT*RF)%mod + (RT * LF)%mod + (LF*RF)%mod )%mod;
               }
            }
            if(s.charAt(k)=='|'){
                if(isTrue==1){
                    ways = (ways + (LT*RT)%mod + (LT * RF)%mod + (LF*RT)%mod ) %mod;
                }
                else{
                    ways = (ways +  (LF*RF)%mod ) %mod;
                }
            }
             else if (s.charAt(k) == '^') {  // Handle XOR
                if (isTrue == 1) {
                    ways = (ways + (LT * RF) % mod + (RT * LF) % mod) % mod;
                } else {
                    ways = (ways + (LF * RF) % mod + (LT * RT) % mod) % mod;
                }
            }
        }
        dp[i][j][isTrue] = ways%mod;
        return dp[i][j][isTrue];
    }
}