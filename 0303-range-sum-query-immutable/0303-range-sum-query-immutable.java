class NumArray {

    private int[] prefixSum;
    public NumArray(int[] nums) {
        prefixSum = new int[nums.length];

        for(int i=0; i < nums.length ; i++) {
            prefixSum[i] = nums[i];
            if(i > 0) prefixSum[i] += prefixSum[i-1];
        }
    }
    
    public int sumRange(int left, int right) {
        return prefixSum[right] - (left > 0 ? prefixSum[left-1] : 0);
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */