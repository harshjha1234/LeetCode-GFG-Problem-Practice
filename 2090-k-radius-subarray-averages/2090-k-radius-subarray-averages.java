class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n = nums.length, K = 2*k + 1, ans[] = new int[n];
        var sum = 0L;

        Arrays.fill(ans, -1);
        if (K > n) return ans;

        for (var i = 0; i < K; i++)
          sum += nums[i];

        ans[k] = (int) (sum / K);
        for (var i = k+1; i < n-k; i++) {
          sum += nums[i+k] - nums[i-k-1];
          ans[i] = (int) (sum / K);
        }
        return ans;
    }
}