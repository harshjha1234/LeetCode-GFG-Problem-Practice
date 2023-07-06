class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int ans=nums.length+1,j=0,sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum=sum+nums[i];
            if(sum>=target)
            {
                while(sum>=target)
                {
                    sum-=nums[j++];
                }
                ans=Math.min(ans,i-j+2);
            }
        }
        return ans == nums.length+1 ? 0 : ans;
    }
}