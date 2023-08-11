class Solution {
    public int change(int amount, int[] coins) {
        int len = coins.length;
        int [][]dp= new int[len+1][amount+1];
        for(int i=len-1; i>=0; i--) {
            for(int j=0; j<=amount; j++) {
                int take=0,skip=0;
                if(j==0) take = 1;
                else if(coins[i]<=j)take=dp[i][j-coins[i]]+dp[i+1][j];
                else skip=dp[i+1][j];
                dp[i][j]=Math.max(skip,take);
            }
        }
        return dp[0][amount];
    }
}