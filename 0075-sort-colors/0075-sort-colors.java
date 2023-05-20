class Solution {
    public void sortColors(int[] nums) {
        int[] a = new int[nums.length];
        Arrays.fill(a,1);
        int s=0;
        int l=nums.length-1;
        for(int i=0; i< nums.length; i++)
        {
            if(nums[i]==0)
            {
                a[s]=0;                
                s++;

            }
            else if(nums[i]==2)
            {
                a[l]=2;
                l--;
            }
        }
        for(int j=0; j<a.length; j++)
        {
            nums[j]=a[j];
        }
    }
}