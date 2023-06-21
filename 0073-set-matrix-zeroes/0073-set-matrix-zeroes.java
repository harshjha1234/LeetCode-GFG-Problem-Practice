class Solution {
    public void setZeroes(int[][] matrix) {
      int m = matrix.length; 
      int n = matrix[0].length; 
      int k = 0;
      while(k < n && matrix[0][k] != 0){  
          ++ k;
      }
      for(int i = 1; i < m; i ++){ 
        for(int j = 0; j < n; j ++){
         if(matrix[i][j] == 0){
          matrix[0][j] = matrix[i][0] = 0;
         }
        }
      }
      for(int i = 1; i < m; i ++){
        for(int j = n - 1; j >=0; j --){
         if(matrix[0][j] == 0 || matrix[i][0] == 0){
          matrix[i][j] = 0;
         }
        }
      }
      if(k < n) {
          Arrays.fill(matrix[0], 0);
      }
    }
}