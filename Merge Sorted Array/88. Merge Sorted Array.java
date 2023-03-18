class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int m2 = n - 1;
		    int m1 = m - 1;
		    for (int i = m + n - 1; i >= 0; i--) {
			    if (m2 == -1) {
				    break;
			    } else if (m1 == -1||nums2[m2] >= nums1[m1]) {
				    nums1[i] = nums2[m2--];
			    } else {
				    nums1[i] = nums1[m1--];
			    }
		   }
    }
}
