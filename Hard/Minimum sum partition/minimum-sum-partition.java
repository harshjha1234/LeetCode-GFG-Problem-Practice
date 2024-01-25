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
                    int A[] = new int[n];
                    for(int i = 0;i<n;i++)
                        A[i] = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.minDifference(A,n));
                }
        }
}    
// } Driver Code Ends


//User function Template for Java

class Solution
{

	public int minDifference(int arr[], int n) 
	{ 
	    // Your code goes here
	    int arrSum = 0;
	    for(Integer i : arr){
	        arrSum += i;
	    }
	   
	    boolean dp[][] = new boolean[n+1][arrSum+1];
	    for(int i = 0; i <= n ; i++){
	        dp[i][0] = true;
	    }
	        
	    for(int i = 1; i<=n ; i++){
	        for(int j = 0; j <= arrSum ; j++){
	            if(arr[i-1] <=j){
	                dp[i][j] = dp[i-1][j] || dp[i-1][j-arr[i-1]];
	            }else{ 
	                dp[i][j] = dp[i-1][j];
	            }
	        }
	    }
	   
	   List<Integer> candidates = new ArrayList<>();
	   for(int j=0 ; j <= arrSum/2 ; j++){
	        if(dp[n][j]){
	            candidates.add(j);
	        }
	   }
	   
	   int min = Integer.MAX_VALUE;
	   for(int i = 0 ; i< candidates.size() ;i++){
	       min = Math.min(min,arrSum - 2*candidates.get(i));
	   }
	   return min;
	} 
}
