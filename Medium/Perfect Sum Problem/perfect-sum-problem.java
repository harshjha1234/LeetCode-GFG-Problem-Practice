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
                    int sum = sc.nextInt();
                    int arr[] = new int[n];
                    for(int i = 0;i<n;i++)
                    arr[i] = sc.nextInt();
                    
                    Solution ob = new Solution();
                    System.out.println(ob.perfectSum(arr,n,sum));
                }
        }
}    
// } Driver Code Ends


class Solution{
    int mod=1000000007;
    
    public int recur(int[] arr, int tar,int i,int[][] dp){
        if(tar<0) return 0;
        if(i>=arr.length){
            if(tar==0) return 1;
            else return 0;
        }
        if(dp[i][tar]!=-1) return dp[i][tar];
        int take=0;
        if(arr[i]<=tar) take=recur(arr,tar-arr[i],i+1,dp);
        int not=recur(arr,tar,i+1,dp);
        return dp[i][tar]=(take+not)%mod;
    }
	public int perfectSum(int arr[],int n, int sum) 
	{ 
	    // Your code goes here
	    int[][] dp=new int[n][sum+1];
        for(int[] nums:dp){ 
            Arrays.fill(nums,-1);
        }
        return recur(arr,sum,0,dp);
	} 
}