class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] trust1 = new int[n];
        int[] trusted = new int[n];
        for(int i = 0; i < trust.length; i++){
            int a = trust[i][0]; 
            int b = trust[i][1];
            trust1[a - 1]++;
            trusted[b - 1]++;
        }
        for(int i = 0; i < n; i++){
            if(trust1[i] == 0 && trusted[i] == n - 1)
                return i + 1;
        }
        return -1;
    }
}
