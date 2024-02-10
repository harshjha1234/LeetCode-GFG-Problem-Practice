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
            
            int  k = Integer.parseInt(read.readLine());
            int  n = Integer.parseInt(read.readLine());
            int arr[][] = new int[n][n];
            String input_line1[] = read.readLine().trim().split("\\s+");
            int c = 0;
            for(int i=0;i<n;i++){
                for(int j = 0;j<n;j++){
                    arr[i][j] = Integer.parseInt(input_line1[c]);
                    c++;
                }
            }
            Solution obj = new Solution();
            System.out.println(obj.numberOfPath(n, k, arr));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    long numberOfPath(int n, int k, int [][]arr) {
        // code here
        long res=count(0,0,0,arr,n,k);
        return res;
    }
    static long count(int sum,int i,int j,int arr[][],int n,int k)
    {
     if(i==n || j==n)
     return 0;
     sum+=arr[i][j];
     if(sum==k && (i==n-1 && j==n-1))
     {
         return 1;
     }
     if(sum>k)
     return 0;
     
     long a=count(sum,i+1,j,arr,n,k);
     long b=count(sum,i,j+1,arr,n,k);
     
     return a+b;
    }
}