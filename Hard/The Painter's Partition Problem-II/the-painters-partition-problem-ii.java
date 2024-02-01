//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String input_line1[] = read.readLine().trim().split("\\s+");
            int k = Integer.parseInt(input_line1[0]);
            int n = Integer.parseInt(input_line1[1]);
            String input_line[] = read.readLine().trim().split("\\s+");
            int arr[]= new int[n];
            for(int i = 0; i < n; i++)
                arr[i] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            System.out.println(ob.minTime(arr,n,k));
        }
    }
}


// } Driver Code Ends


//User function Template for Java

 class Solution{
    static long minTime(int[] arr,int n,int k){
        //code here
        long sum = 0;
             for(int i = 0; i<n; i++) sum+=arr[i];
             return helper(arr, arr[n-1],sum,k,-1);
    }
    public static long helper(int[] arr, long start , long end , int k, long ans){
        if( start <= end){
            long mid = start + (end-start)/2;
            if(isPossible(arr,k,mid)){
                ans = mid;
                return helper(arr,start,mid-1,k,ans);
            }else{
                return helper(arr, mid+1,end, k, ans);
            }
        }
        return ans;
    }
    public static boolean isPossible(int[] arr, int k ,long mid){
        int painter = 1, boards = 0;
        for(int i = 0; i<arr.length; i++){
            if(boards + arr[i] <= mid){
                boards+=arr[i];
            }else{
                painter++;
                if(painter > k || arr[i] > mid) return false; 
                
                boards = arr[i];
            }
        }
        return true;
    }
}


