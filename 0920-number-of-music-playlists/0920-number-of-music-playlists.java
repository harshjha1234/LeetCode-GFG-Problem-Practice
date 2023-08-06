class Solution {
    public int numMusicPlaylists(int n, int goal, int k) {
        int modulo = 1_000_000_007;

        long[] dp = new long[goal - n + 1];
        Arrays.fill(dp, 1);

        for (int p = 2; p <= n - k; ++p) {
            for (int i = 1; i <= goal - n; ++i) {
                dp[i] += dp[i - 1] * p;
                dp[i] %= modulo;
            }
        }
        long result = dp[goal - n];
        for (int key = 2; key <= n; ++key) {
            result = result * key % modulo;
        }
        return (int) result;
    }
}