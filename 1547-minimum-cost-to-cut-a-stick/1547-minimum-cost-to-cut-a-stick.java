class Solution {
    public int minCost(int n, int[] cuts) {
        int len = cuts.length;
        int[][] dp = new int[len + 2][len + 2];
        ArrayList<Integer> l = new ArrayList<>();
        for (int ele: cuts) {
            l.add(ele);
        }
        l.add(n);
        l.add(0, 0);
        Collections.sort(l);
        for (int i = len; i >= 1; i--) {
            for (int j = 1; j <= len; j++) {
                if (i > j) {
                    continue;
                }
                int m = Integer.MAX_VALUE;
                for (int ind = i; ind <= j; ind++) {
                    int cost = l.get(j + 1) - l.get(i - 1) + dp[i][ind - 1] + dp[ind + 1][j];
                    m = Math.min(m, cost);
                }
                dp[i][j] = m;
            }
        }
        return dp[1][len];
    }
}