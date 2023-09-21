class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i=0, j=0, k=0;
        int[] merArr =new int[nums1.length + nums2.length];
        //To check the condition if length of array is greater than 0 
        while(i<nums1.length || j<nums2.length){
            if(i<nums1.length && j<nums2.length && nums1[i]<=nums2[j]){
                merArr[k] = nums1[i];
                k++;
                i++;
            }
            else if(i<nums1.length && j<nums2.length && nums1[i]>nums2[j]){
                merArr[k] = nums2[j];
                k++;
                j++;
            }
            else if(i < nums1.length){
                merArr[k] = nums1[i];
                k++;
                i++;
            }
            else if(j < nums2.length){
                merArr[k] = nums2[j];
                k++;
                j++;
            }
        }
        if(merArr.length % 2 == 0)
            return (double)(merArr[(merArr.length)/2] + merArr[(merArr.length/2)-1])/2;
        else
            return merArr[merArr.length/2];
    }
}