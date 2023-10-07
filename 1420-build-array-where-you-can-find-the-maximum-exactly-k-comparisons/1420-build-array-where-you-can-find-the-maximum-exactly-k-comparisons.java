class Solution {
    public int numOfArrays(int n, int m, int k) {
        long[][][] dp =new long[n][k][m];
        long mod = 1000000007;
        Arrays.fill(dp[0][0], 1);
        for (int i = 1;i<n;i++) {
            for (int cost = 0;cost <Math.min(i+1, k);cost++) {
                for (int max = 0;max < m;max++){
                    long sum = 0;
                    sum += dp[i-1][cost][max] * (max+1);
                    
                    if (cost != 0) {
                        long[] arr = dp[i-1][cost-1];
                        for (int prevMax = 0;prevMax < max; prevMax++) {
                            sum += arr[prevMax];
                        }
                    }
                    dp[i][cost][max] = sum %mod;
                }
            }
        }
        long ans = 0;
        for (int max = 0;max < m;max++) {
            ans += dp[n-1][k-1][max];
            ans %= mod;
        }
        return (int) ans;
    }
}