class Solution {
    public int minExtraChar(String s, String[] dictionary) {
        int maxVal = s.length()+1;
        int[] dp = new int[maxVal];
        Arrays.fill(dp,maxVal);
        dp[0]=0;
        Set<String> hashset = new HashSet<>(Arrays.asList(dictionary));
        for(int i=1;i<=s.length();i++){
            dp[i]=dp[i-1]+1;
            for(int j=1;j<=i;j++){
                if(hashset.contains(s.substring(i-j,i))){
                    dp[i] = Math.min(dp[i],dp[i-j]);
                }
            }
        }
        return dp[s.length()];
    }
}