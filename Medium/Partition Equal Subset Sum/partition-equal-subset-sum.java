//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String input_line[] = in.readLine().trim().split("\\s+");
            int arr[] = new int[N];
            for(int i = 0;i < N;i++)
                arr[i] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            int x = ob.equalPartition(N, arr);
            if(x == 1)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution{
    static int equalPartition(int N, int arr[])
    {
        // code here
         int totalSum = 0;

        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
        }

        if (totalSum == 0 || totalSum % 2 != 0) {
            return 0;
        }

        int target = totalSum / 2;

        int[][] dp = new int[arr.length + 1][target + 1];
        for (int[] d : dp) {
            Arrays.fill(d, -1);
        }

        return solve(arr, target, 0, dp) ? 1 : 0;
    }

    static boolean solve(int[] arr, int target, int i, int[][] dp) {
        if(i >= arr.length || target < 0){
            return false;
        }

        if(target == 0){
            return true;
        }

        if(dp[i][target] != -1){
            return dp[i][target] == 1;
        }


        boolean include = solve(arr, target - arr[i], i + 1, dp);
        boolean exclude = solve(arr, target, i + 1, dp);

        dp[i][target] = include || exclude ? 1 : 0;

        return dp[i][target] == 1;
    }
}