class Solution {
    public int[] rearrangeArray(int[] nums) {
        Queue<Integer> p = new LinkedList<>();
        for(int i : nums)
        {
            if(i>=0) {
                p.add(i);
            }
        }
        Queue<Integer> n = new LinkedList<>();
        for(int i : nums)
        {
            if(i<0) {
                n.add(i);
            }
        }
        for(int i=0; i<nums.length; i++)
        {
            if(i%2==0) {
                nums[i]=p.poll();
            }
            else
            {
                nums[i]=n.poll();
            }
        }
        return nums;
    }
}