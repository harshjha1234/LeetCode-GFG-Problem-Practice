class Solution {
    Set<List<Integer>> ans = new HashSet<>();
    List<Integer> subset = new ArrayList<>();
    public void genrateSubsequences(int[] nums,int idx)
    {
        if(nums.length==idx)
        {
            if(subset.size()>1)
                ans.add(new ArrayList<>(subset));
            return;
        }
        if(subset.size()==0 || subset.get(subset.size()-1)<=nums[idx])
        {
            subset.add(nums[idx]);
            genrateSubsequences(nums,idx+1);
            subset.remove(subset.size()-1);
        }
        genrateSubsequences(nums,idx+1);
    }
    public List<List<Integer>> findSubsequences(int[] nums) {
        genrateSubsequences(nums,0);
        return new ArrayList(ans);
    }
}
