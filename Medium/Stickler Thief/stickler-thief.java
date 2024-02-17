//{ Driver Code Starts
import java.util.*;
import java.io.*;

class GFG
 {
	public static void main (String[] args)
	 {
	  
	  //taking input using Scanner class
	  Scanner sc = new Scanner(System.in);
	  
	  //taking count of testcases
	  int t = sc.nextInt();
	  while(t-- > 0){
	      
	      //taking count of houses
	      int n = sc.nextInt();
	      int arr[] = new int[n];
	      
	      //inserting money present in 
	      //each house in the array
	      for(int i = 0; i<n; ++i)
	           arr[i] = sc.nextInt();
  	      
  	      //calling method FindMaxSum() of class solve
  	      System.out.println(new Solution().FindMaxSum(arr, n));
	 }
   }
}
// } Driver Code Ends


class Solution
{
    //Function to find the maximum money the thief can get.
    public int find(int arr[],int i,int dp[]){
        if(i == arr.length-1)return arr[i];
        if(i >= arr.length)return 0;
        if(dp[i] != -1)return dp[i];
        int pick = arr[i]+find(arr,i+2,dp);
        int no = find(arr,i+1,dp);
        return dp[i] = Math.max(pick,no);
    }
    public int FindMaxSum(int arr[], int n)
    {
        // Your code here
        int dp[] = new int[n];
        for(int i = 0; i < n ; i++)dp[i] = -1;
        int ans = find(arr,0,dp);
        return ans;
    }
}