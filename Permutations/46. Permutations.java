class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> a = new ArrayList<>();
        permutation(nums,a,0);
        return a;
    }
    public void permutation(int nums[],List<List<Integer>> a,int index){
        if(index>=nums.length){
            ArrayList<Integer> l=new ArrayList<>();

            for(Integer x:nums){
                l.add(x);
            }
            a.add(l);
            return;
        }
        for(int i=index;i<nums.length;i++){
            int temp=nums[index];
            nums[index]=nums[i];
            nums[i]=temp;
            permutation(nums,a,index+1);
            temp=nums[index];
            nums[index]=nums[i];
            nums[i]=temp;
        }
    }
}
