class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length, n = obstacleGrid[0].length;
        int dp[][] = new int [m+1][n+1];
        if(obstacleGrid[0][0] != 1)
        dp[1][1] = 1;
        for (int i = 1; i <= m; i++)
            for (int j = 1; j <= n; j++)
                if (obstacleGrid[i - 1][j - 1] != 1)
                    dp[i][j] += dp[i - 1][j] + dp[i][j - 1];
        return dp[m][n];
    }
}