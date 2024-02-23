//{ Driver Code Starts
import java.io.*;
import java.util.*;


class GFG {
	public static void main (String[] args) {
		
		//taking input using Scanner class
		Scanner sc = new Scanner(System.in);
		
		//taking total testcases
		int t = sc.nextInt();
		
		while(t-- > 0){
		    
		    //taking count of stairs
		    int m = sc.nextInt();
		    
		    //creating an object of class DynamicProgramming
		    Solution obj = new Solution();
		    
		    //calling method countWays() of class
		    //DynamicProgramming
		    System.out.println(obj.countWays(m));
		    
		}
		
	}
}
// } Driver Code Ends


class Solution
{
    //Function to count number of ways to reach the nth stair.
    int mod = 1000000007;
    int find(int n,int dp[]){
        if(n == 0)return 1;
        if(n <0)return 0;
        if(dp[n] != -1)return dp[n]%mod;
        dp[n] = find(n-1,dp)%mod+find(n-2,dp)%mod;
        return dp[n]%mod;
    }
    int countWays(int n)
    {
        // your code here
        int dp[] = new int[n+1];
        for(int i = 0; i <= n ; i++)dp[i] = -1;
        int ans = find(n,dp);
        return ans;
    }
}

