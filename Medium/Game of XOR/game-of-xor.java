//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            
            String S[] = read.readLine().split(" ");
            int[] A = new int[N];
            
            for(int i=0 ; i<N ; i++)
                A[i] = Integer.parseInt(S[i]);

            Solution ob = new Solution();
            System.out.println(ob.gameOfXor(N,A));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int gameOfXor(int N , int[] A) {
        // code here
        int res=0;
        // N--;
        for(int i=0; i<=N-1; i++){
            int s = N-i;
            int e = i*(N-i);
            int t = s+e;
            if(t%2==0){
                res ^= 0;
            }else{
                res ^= A[i];
            }
        }
        return res;
    }
};