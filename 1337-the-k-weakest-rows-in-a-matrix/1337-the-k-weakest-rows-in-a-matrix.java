class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int m = mat.length;
        int n = mat[0].length;
        
        int[] strength = new int[m];
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 1) {
                    strength[i]++;
                } else {
                    break;
                }
            }
        }
        
        List<Integer> rowIndices = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            rowIndices.add(i);
        }
        Collections.sort(rowIndices, (a, b) -> {
            if (strength[a] == strength[b]) {
                return a - b;
            }
            return strength[a] - strength[b];
        });
        
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = rowIndices.get(i);
        }
        
        return result;
    }
}