class Solution {
    public int minFlipsMonoIncr(String s) {
        int n = s.length();
        int[] sumL1R0 = new int[n];

        int oneCount = 0;
        int zeroCount = 0;

        for(int i = 0; i < n; i++){
            sumL1R0[i] += oneCount;
            if(s.charAt(i) == '1'){
                oneCount++;
            }
            int r = n - 1 - i;
            sumL1R0[r] += zeroCount;
            if(s.charAt(r) == '0'){
                zeroCount++;
            }
        }

        int min = Integer.MAX_VALUE;
        for(int i : sumL1R0){
            min = Math.min(min, i);
        }
        return min;  
    }
}
