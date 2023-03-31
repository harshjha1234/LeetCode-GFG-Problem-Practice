class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> res = new LinkedList<String>();
        if (nums == null || nums.length == 0) {
            return res;
        }
        for (int i = 0; i < nums.length; i ++) {
            if (i == nums.length - 1 || nums[i] != nums[i + 1] - 1) {
                res.add(nums[i] + "");
                continue;
            }
            int left = nums[i];
            int j = i + 1;
            for (; j < nums.length; j ++) {
                if (j == nums.length - 1 || nums[j] != nums[j + 1] - 1) {
                    break;
                }
            }
            res.add(left + "->" + nums[j]);
            i = j;
        }
        return res;
    }
}
