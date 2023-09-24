class Solution {
    public double champagneTower(int poured, int query_row, int query_glass) {
        double[] currentLevel = { poured };
        
        for (int row = 0; row < query_row; row++) {
            double[] nextLevel = new double[row + 2];
            Arrays.fill(nextLevel, 0.0);
            for (int glass = 0; glass < currentLevel.length; glass++) {
                double overflow = (currentLevel[glass] - 1.0) / 2.0;
                if (overflow > 0.0) {
                    nextLevel[glass] += overflow;
                    nextLevel[glass + 1] += overflow;
                }
            }
            currentLevel = nextLevel;
        }
        return Math.min(1.0, currentLevel[query_glass]);
    }
}