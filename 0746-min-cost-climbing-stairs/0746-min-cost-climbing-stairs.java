class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int prev2 = cost[0];
        int prev1 = cost[1];
        for(int i=2; i<cost.length; i++){
            int res = cost[i]+Math.min(prev1, prev2);
            prev2 = prev1;
            prev1 = res;
        }
        return Math.min(prev1, prev2);
    }
}