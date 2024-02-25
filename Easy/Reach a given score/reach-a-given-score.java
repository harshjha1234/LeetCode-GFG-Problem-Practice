//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class GFG {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        while(t > 0)
        {
            int n = in.nextInt();
            Geeks obj = new Geeks();
            System.out.println(obj.count(n));
            t--;
        }
    }
}
// } Driver Code Ends


// Complete this function!

class Geeks {
    public static long solve(int n, int sum, int[] arr,long [][] dp){
        for(int i = 0; i <= n; i++){
            for(int j = 0; j <= sum; j++){
                if(i == 0 && j != 0){
                    dp[i][j] = 0L;
                }
                if(j == 0)dp[i][j] = 1L;
            }
        }
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= sum; j++){
                if(arr[i-1] <= j){
                    dp[i][j] = dp[i][j-arr[i-1]] + dp[i-1][j];
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[3][sum];
        
    }
    public long count(int n) {
        // Add your code here.
        long[][] dp = new long[4][n+1];
        int[] arr = new int[3];
        arr[0] = 3;
        arr[1] = 5;
        arr[2] = 10;
        return solve(3,n,arr,dp);
    }
}