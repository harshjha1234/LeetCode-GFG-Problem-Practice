class Solution {
    public int maxArea(int[] height) {
        int a = 0;
        int i = 0;
        int j = height.length - 1;
        while (i < j) {
            int hv = (height[i] > height[j] ? height[j] : height[i]);
            int av = hv * (j - i);
            if (av > a){
                a = av;
            }
            while (height[i] <= hv && i < j){ 
                i++;
            }
            while (height[j] <= hv && i < j){ 
                j--;
            }
        }
        return a;
    }
}
