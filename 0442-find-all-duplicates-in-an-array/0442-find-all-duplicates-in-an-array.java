class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        LinkedList<Integer> l = new LinkedList<>();
        Arrays.sort(nums);
        for(int i = 0; i<nums.length-1; i++){
                if(nums[i]==nums[i+1])
                    l.add(nums[i]);
        }
        Collections.sort(l);
        return l;
    }
}