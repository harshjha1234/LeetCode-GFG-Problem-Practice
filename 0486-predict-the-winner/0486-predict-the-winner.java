class Solution {
    int[][] dp;

    public int solve(int[] nums, int i, int j){
        if(i > j) return 0;
        if(i == j) return nums[i];

        if(dp[i][j] != -1) return dp[i][j];

        int take_i = nums[i] - solve(nums, i+1, j);
        int take_j = nums[j] - solve(nums, i, j-1);

        return dp[i][j] = Math.max(take_i, take_j);
    }

    public boolean PredictTheWinner(int[] nums) {
        int n = nums.length;
        dp = new int[n+1][n+1];
        for(int[] row : dp){
            Arrays.fill(row, -1);
        }
        return solve(nums, 0, n-1) >= 0;
    }
}