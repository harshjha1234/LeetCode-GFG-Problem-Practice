class Solution {
    public boolean isMatch(String s, String p) {
        int m = s.length();
        int n = p.length();
        
        // dp[i][j] represents whether the first i characters in s match the first j characters in p
        boolean[][] dp = new boolean[m+1][n+1];
        
        // base case: empty string matches empty pattern
        dp[0][0] = true;
        
        // deal with patterns like "a*", "b*", "c*", etc.
        for (int j = 1; j <= n; j++) {
            if (p.charAt(j-1) == '*') {
                dp[0][j] = dp[0][j-2];
            }
        }
        
        // fill in the rest of the dp table
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                char sc = s.charAt(i-1);
                char pc = p.charAt(j-1);
                
                if (pc == '.' || sc == pc) {
                    // the current characters match, so the result depends on the previous characters
                    dp[i][j] = dp[i-1][j-1];
                } else if (pc == '*') {
                    char prevPc = p.charAt(j-2);
                    // match zero or more of the previous character
                    dp[i][j] = dp[i][j-2];
                    if (prevPc == '.' || prevPc == sc) {
                        dp[i][j] = dp[i][j] || dp[i-1][j];
                    }
                } else {
                    // the current characters don't match and there's no '*' in the pattern
                    dp[i][j] = false;
                }
            }
        }
        
        return dp[m][n];
    }
}
