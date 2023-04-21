class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> a=new ArrayList<>();
        ArrayList<Integer> s=new ArrayList<>();
        pwh(nums,0,s,a);
        return a;
    }
    public void pwh(int []nums,int i,ArrayList<Integer> s,List<List<Integer>> a){
        if(i>=nums.length){
            a.add(new ArrayList<>(s));
            return;
        }

        s.add(nums[i]);
        pwh(nums,i+1,s,a);
        s.remove(s.size()-1);
        pwh(nums,i+1,s,a);
    }
}
