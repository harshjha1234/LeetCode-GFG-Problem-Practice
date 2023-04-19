class Solution {
    public int[][] generateMatrix(int n) {
        int[][] m = new int[n][n];
        
        int t = 0, b = n - 1;
        int l = 0, r = n - 1;

        int num = 1;

        while (num <= n * n) {
            for (int j = l; j <= r; j++) {
                m[t][j] = num++;
            }
            t++;
            
            for (int i = t; i <= b; i++) {
                m[i][r] = num++;
            }
            r--;
            
            for (int j = r; j >= l; j--) {
                m[b][j] = num++;
            }
            b--;
            
            for (int i = b; i >= t; i--) {
                m[i][l] = num++;
            }
            l++;
        }
        return m;
    }
}
