//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader in =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while (t-- > 0) {
            int K = Integer.parseInt(in.readLine());
            int N = Integer.parseInt(in.readLine());
            String input_line[] = in.readLine().trim().split("\\s+");
            int A[] = new int[N];
            for (int i = 0; i < N; i++) A[i] = Integer.parseInt(input_line[i]);

            Solution ob = new Solution();
            System.out.println(ob.maxProfit(K, N, A));
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    static int maxProfit(int K, int N, int A[]) {
        // code here
        int after[][] = new int[2][K+1];
        int curr[][] = new int[2][K+1];
        for(int idx=N-1; idx>=0; idx--){
            for(int buy=0; buy<=1; buy++){
                for(int cap=1; cap<=K; cap++){
                    if(buy == 1){
                        curr[buy][cap] = Math.max(-A[idx]+after[0][cap],0+after[1][cap]);
                    }
                    else{
                        curr[buy][cap] = Math.max(A[idx]+after[1][cap-1],0+after[0][cap]);
                    }
                }
                
            }
            after = curr;
        }
        
        return after[1][K];
    }
}