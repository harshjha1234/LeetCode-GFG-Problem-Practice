//{ Driver Code Starts
//Initial Template for Java

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
            String[] S1 = br.readLine().trim().split(" ");
            int n  = Integer.parseInt(S1[0]);
            int m = Integer.parseInt(S1[1]);
            int[][] matrix = new int[n][m];
            for(int i = 0; i < n; i++){
                String[] S2 = br.readLine().trim().split(" ");
                for(int j = 0; j < m; j++){
                    matrix[i][j] = Integer.parseInt(S2[j]);
                }
            }
            Solution obj = new Solution();
            int ans = obj.longestIncreasingPath(matrix);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int longestIncreasingPath(int[][] matrix)
    {
        // Code here
        int ans=0;
        int n=matrix.length;
        int m=matrix[0].length;
        int dp[][]=new int[n][m];
        for(int i=0; i<n; i++)for(int j=0; j<m; j++)dp[i][j]=-1;
        for(int i=0; i<n; i++)for(int j=0; j<m; j++)ans=Math.max(ans,f(matrix,n,m,i,j,0,dp));
        return ans;
    }

    int f(int mat[][], int n, int m, int i, int j, int val,int dp[][]){
        if(i>=n || i<0 || j>=m || j<0 || mat[i][j]<=val )return 0;
        if(dp[i][j]!=-1)return dp[i][j];
            int u=f(mat,n,m,i-1,j,mat[i][j],dp);
            int d=f(mat,n,m,i+1,j,mat[i][j],dp);
            int l=f(mat,n,m,i,j-1,mat[i][j],dp);
            int r=f(mat,n,m,i,j+1,mat[i][j],dp);
            return dp[i][j]=Math.max(u,Math.max(d,Math.max(l,r)))+1;
    }
}