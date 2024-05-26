//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String X = sc.next();
            String Y = sc.next();
            int costX = sc.nextInt();
            int costY = sc.nextInt();

            Solution ob = new Solution();
            System.out.println(ob.findMinCost(X, Y, costX, costY));
        }
    }
}
// } Driver Code Ends


class Solution {
    public int findMinCost(String x, String y, int costX, int costY) {
        int n=x.length();
        int m=y.length();
        int dp[][]=new int[n+1][m+1];
        for(int arr[]:dp)
        {
            Arrays.fill(arr,-1);
        }
        for(int i=0;i<=n;i++)
        {
            dp[i][0]=0;
        }
         for(int j=0;j<=m;j++)
        {
            dp[0][j]=0;
        }
        for(int ind1=1;ind1<=n;ind1++)
        {
            for(int ind2=1;ind2<=m;ind2++)
            {
                 if(x.charAt(ind1-1)==y.charAt(ind2-1))
                 {
                   dp[ind1][ind2]=1+dp[ind1-1][ind2-1];
                 }
                 else dp[ind1][ind2]=Math.max(dp[ind1-1][ind2],dp[ind1][ind2-1]);

            }
        }

       int lcs=dp[n][m];
       return (n-lcs)*costX+(m-lcs)*costY;
    }
}
