//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s = read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.distinctSubsequences(s));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int distinctSubsequences(String S) {
        // code here
        int mod = 1000000007;
        int dp[] = new int[S.length()+1];
        dp[0] = 1;
        
        int ch[] = new int[26];
        
        for(int i=1;i<dp.length;i++){
            int val = ch[S.charAt(i-1)-'a'];
            dp[i] = ((2 * dp[i-1])%mod) - val;
            dp[i] %= mod;
            ch[S.charAt(i-1) - 'a'] = dp[i-1];
        }
        int ans = (dp[S.length()]+mod)%mod;
        return ans;
    }
}