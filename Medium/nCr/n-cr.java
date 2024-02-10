//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String read[] = in.readLine().trim().split("\\s+");
            int n = Integer.parseInt(read[0]);
            int r = Integer.parseInt(read[1]);
            
            Solution ob = new Solution();
            System.out.println(ob.nCr(n, r));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution{
    static int nCr(int n, int r)
    {
        // code here
        if(n<r) return 0;
        long mod = (long)1e9+7;
        long res = 1L;
        for(long i = 0; i < r; i++){
            res = ((res%mod) * (n-i)%mod) % mod;
            res = ((res%mod) * (binaryexponentiation(i+1L,mod-2L,mod)%mod))%mod;
        }
        return (int) res;
    }
    
    static long binaryexponentiation(long x,long a,long mod){
        a %= mod;
        long res = 1L;
        while(a>0){
            if((a & 1L) == 1L)
                res = res * x % mod;
            x = x * x % mod;
            a >>= 1;
        }
        return res;
    }
}