class Solution {
    public int constrainedSubsetSum(int[] nums, int k) {
        int n = nums.length;
        int[] dp = new int[n];
        dp[0] = nums[0];
        int temp = Math.max(dp[0],0);
        Queue<Integer> q = new LinkedList<>();
        TreeMap<Integer,Integer> map = new TreeMap<>();
        q.add(dp[0]);
        map.put(dp[0],1);
        for(int i=1;i<n;i++){
            dp[i] = nums[i];
            if(map.lastKey()>0) dp[i] += map.lastKey();
            map.put(dp[i],map.getOrDefault(dp[i],0)+1);
            q.add(dp[i]);
            if(q.size()>k){
                int val = q.remove();
                if(map.get(val)==1) map.remove(val);
                else map.put(val,map.get(val)-1);
            }
        }
        int ans = dp[0];
        for(int i=0;i<n;i++){
            ans = Math.max(ans,dp[i]);
        }
        return ans;
    }
}