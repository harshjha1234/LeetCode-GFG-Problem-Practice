//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int[] nums = new int[n];
            String[] S = br.readLine().trim().split(" ");
            for(int i = 0; i < n; i++)
                nums[i]  =Integer.parseInt(S[i]);
            int k = Integer.parseInt(br.readLine().trim());
            Solution obj = new Solution();
            System.out.println(obj.solveWordWrap(nums, k));
        }
    }
}

// } Driver Code Ends


class Solution
{
    public int solveWordWrap (int[] nums, int k)
    {
       int[][] dp = new int[nums.length][2001];
       for(int row[]: dp){
         Arrays.fill(row, -1);
       }
       return helper(0, k, nums, k, dp);
    }
    public static int helper(int i, int curr, int[] nums, int k, int dp[][])
    {
        if(i == nums.length){
            return 0;
        }
        
        if(curr >= 0 && dp[i][curr] != -1){
            return dp[i][curr];
        }
        
        int pick = Integer.MAX_VALUE;
        if(nums[i] <= curr){
            pick = helper(i+1, curr-nums[i]-1, nums, k, dp);
        }

        int notPick = (curr+1)*(curr+1) + helper(i+1, k-nums[i]-1, nums, k, dp);
        int ans = Math.min(pick, notPick);
        if(curr >= 0){
            dp[i][curr] = ans;
        }
        return ans;
    }
}