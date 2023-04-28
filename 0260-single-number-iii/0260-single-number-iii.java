class Solution {
    public int[] singleNumber(int[] nums) {
        int p=0;
        int q=0;
        for(int i:nums) {
            p^=i;
        }
        for(int i:nums){
            q^=(((p&(-p))&i)==0)?i:0;
        }
        return new int[] {p^q,q};
    }
}