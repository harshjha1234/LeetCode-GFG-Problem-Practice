//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            Solution obj = new Solution();
            int ans = obj.minCandy(n, a);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    static int minCandy(int N, int ratings[]) {
        // code here
        int res = N, i=1;
        // int last = 1, prev=0;
        while(i<N){
            if(ratings[i] == ratings[i-1]){
                i++;
                continue;
            }
            int after = 0;
            while(i<N && ratings[i] > ratings[i-1]){ 
                after++;
                res = res + after;
                i++;
            }
            int prev = 0;
            while(i<N && ratings[i] < ratings[i-1]){
                prev++;
                res += prev;
                i++;
            }
            res = res - Math.min(prev, after);
        }
        return res;
    }
}
