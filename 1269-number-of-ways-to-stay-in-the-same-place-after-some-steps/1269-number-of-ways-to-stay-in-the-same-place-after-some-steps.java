class Solution {
    int[][] memo;
    int MOD = (int) 1e9 + 7;
    int arrLen;
    
    public int dp(int curr, int remain) {
        if (remain == 0) {
            if (curr == 0) {
                return 1;
            }
            
            return 0;
        }
        
        if (memo[curr][remain] != -1) {
            return memo[curr][remain];
        }

        int ans = dp(curr, remain - 1);
        if (curr > 0) {
            ans = (ans + dp(curr - 1, remain - 1)) % MOD;
        }
        
        if (curr < arrLen - 1) {
            ans = (ans + dp(curr + 1, remain - 1)) % MOD;
        }
        
        memo[curr][remain] = ans;
        return ans;
    }
    
    public int numWays(int steps, int arrLen) {
        arrLen = Math.min(arrLen, steps);
        this.arrLen = arrLen;
        memo = new int[arrLen][steps + 1];
        for (int[] row : memo) {
            Arrays.fill(row, -1);
        }
        
        return dp(0, steps);
    }
}