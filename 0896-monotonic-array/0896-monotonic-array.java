class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean isIncreasing = true;  
        boolean isDecreasing = true; 

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1])
                isIncreasing = false;

            else if (nums[i] > nums[i - 1])
                isDecreasing = false;

            if (!isIncreasing && !isDecreasing)
                break;
        }

        return isIncreasing || isDecreasing; 
    }
}