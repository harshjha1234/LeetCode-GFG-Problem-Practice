//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            int ans = ob.nthPoint(n);
            System.out.println(ans);            
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    
    public int nthPoint(int n)
    {
        // Code here
        long mod = 1000000007;
        long[] arr = new long[n+1];
        arr[0] = 1;
        arr[1] = 1;
        for(int i=2; i<=n; i++){
            arr[i] = (arr[i-1] % mod+arr[i-2]%mod)%mod;
        }
        return (int)arr[n];
        
        
    }
}