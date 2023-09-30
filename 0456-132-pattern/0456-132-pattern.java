class Solution {
    public boolean find132pattern(int[] nums) {
        int length = nums.length;
        
        if (length < 3)
            return false;

        Deque<Integer> decreasingStack = new ArrayDeque<>(length);

        int maxThirdElement = Integer.MIN_VALUE;

        for (int i = length - 1; i >= 0; i--) {
            int currentNumber = nums[i];

            if (currentNumber < maxThirdElement)
                return true;  // Found a 132 pattern.

            while (!decreasingStack.isEmpty() && decreasingStack.peek() < currentNumber) {
                maxThirdElement = decreasingStack.pop();
            }

            decreasingStack.push(currentNumber);
        }

        return false;
    }
}