//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            int points[][] = new int[m][n];
            for (int i = 0; i < m; i++)
                for (int j = 0; j < n; j++) points[i][j] = sc.nextInt();
            Solution ob = new Solution();
            System.out.println(ob.minPoints(points, m, n));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int f(int i, int j, int[][] a, int[][] dp) {
        int n = a.length;
        int m = a[0].length;
        if (i == n - 1 && j == m - 1) {
            return Math.max(1, 1 - a[i][j]);
        }
        if (i >= n || j >= m) {
            return Integer.MAX_VALUE;
        }
        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        int right = f(i, j + 1, a, dp);
        int bottom = f(i + 1, j, a, dp);
        int minPoints = Math.min(right, bottom) - a[i][j];
        dp[i][j] = Math.max(1, minPoints);
        return dp[i][j];
    }
    public int minPoints(int points[][], int m, int n) {
        // Your code goes here
        int[][] dp = new int[m][n];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return f(0, 0, points, dp);
    }
}