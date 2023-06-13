class Solution {
    public int equalPairs(int[][] grid) {
        int n = grid.length,c = 0;
        HashMap<Long,Integer> h = new  HashMap<Long,Integer>();
        for(int i=0;i<n;i++){
            long t1 = 0;
            for(int j=0;j<n;j++) t1 = t1 * 10 + grid[i][j];
            h.put(t1,h.getOrDefault(t1,0) + 1);
        }
        for(int i=0;i<n;i++){
            long t2 = 0;
            for(int j=0;j<n;j++) t2 = t2 * 10 + grid[j][i];
            c += h.getOrDefault(t2,0);
        }
        return c;
    }
}