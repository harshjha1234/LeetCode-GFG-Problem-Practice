//{ Driver Code Starts
import java.util.*;
import java.io.*;

public class GFG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- > 0)
        {
            int n = scanner.nextInt();
            int total = scanner.nextInt();
            int[] cost = new int[n];
            for (int i = 0; i < n; i++) {
                cost[i] = scanner.nextInt();
            }
            Solution solution = new Solution();
            int result = solution.max_courses(n, total, cost);
            System.out.println(result);
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution {
    public int max_courses(int n, int total, int[] cost) {
        // code here
        int dp[][] = new int[total + 1][cost.length + 1];
        
        return solve(cost, total, 0, dp);
    }
    public static int solve(int [] arr, int k, int i, int dp[][]){
        
        if(i == arr.length)
            return 0;
            
        if(dp[k][i] != 0)
            return dp[k][i];
            
        int a = 0,b = 0,c = 0;
        if(k >= arr[i]){
            
            a += 1 + solve(arr, (k - arr[i]) + (int)(Math.floor((0.9 * arr[i]))), i+1, dp);
        }
        b=solve(arr, k, i+1, dp);
        
        return dp[k][i] = Math.max(a, b);
    }
}

