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
                    int Arr[] = new int[n];
                    for(int i = 0;i<n;i++)
                        Arr[i] = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.maxSumIS(Arr,n));
                }
        }
}    
// } Driver Code Ends


//User function Template for Java

class Solution
{
	public int maxSumIS(int arr[], int n)  
	{  
	    //code here.
	    HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        
       int arr2[]=new int[set.size()];
       int i=0;
       for(int num:set){
           arr2[i]=num;
           i++;
       }
       Arrays.sort(arr2);
       
      return lcs(arr,arr2);
        
    }  
    
    public int lcs(int arr[],int arr2[]){
         int n=arr.length;
       int m=arr2.length;
       
       int dp[][]=new int[n+1][m+1];
       
       for(int i=0;i<n+1;i++){
           dp[i][0]=0;
       }
        for(int i=0;i<m+1;i++){
           dp[0][i]=0;
       }
       
       for(int i=1;i<n+1;i++){
           for(int j=1;j<m+1;j++){
               if(arr[i-1]==arr2[j-1]){
                   dp[i][j]=dp[i-1][j-1]+arr[i-1];
               }else{
                   int ans1=dp[i][j-1];
                   int ans2=dp[i-1][j];
                   dp[i][j]=Math.max(ans1,ans2);
               }
           }
       }
       return dp[n][m];
	}  
}