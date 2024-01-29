//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String arr[] = in.readLine().trim().split("\\s+");
            long A[] = new long[N];
            for(int i = 0; i < N; i++)
                A[i] = Long.parseLong(arr[i]);
            
            Solution ob = new Solution();
            System.out.println(ob.countBits(N, A));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    private final static long mod = 1000000007;
    static int countBits(int N, long A[])
    {
        // code here
        long ans=0;
        for(int i=0;i<31;i++){
            long cz=0,co=0;
            for(long e:A){
                if((e&(1<<i))>0){
                    co++;
                } else {
                    cz++;
                }
            }
            ans=(ans+2*co*cz)%mod;
        }
        return (int)ans;
    }
}