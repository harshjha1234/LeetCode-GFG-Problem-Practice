class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int r = numbers.length - 1;
        int tmp;
        while (l < r)
        {
            if (numbers[l] + numbers[r] == target) break;
            tmp = target - numbers[r];
            while (numbers[l] < tmp) l++;
            if (numbers[l] + numbers[r] == target) break;
            tmp = target - numbers[l];
            while (numbers[r] > tmp) r--;
        }
        return new int[]{l + 1, r + 1};
    }
}