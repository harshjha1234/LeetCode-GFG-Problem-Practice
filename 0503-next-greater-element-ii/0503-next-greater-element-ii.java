class Solution {
    public int[] nextGreaterElements(int[] nums) {
         int n = nums.length;
        int[] o = new int[n];
        Stack<Integer> s = new Stack<Integer>();
        Arrays.fill(o , -1);
        
        for(int i = 0 ; i < 2*n ; i++){
            int idx = i%n;
            
            while(!s.empty() && nums[idx] > nums[s.peek()]){
                o[s.peek()] = nums[idx];
                s.pop();
            }
            s.push(idx);  
        }
        return o;
    }
}