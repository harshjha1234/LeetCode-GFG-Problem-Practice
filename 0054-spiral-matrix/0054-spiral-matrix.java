class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int r = matrix.length,c = matrix[0].length;
        int[][] visited = new int[r][c];
        List<Integer> l = new ArrayList<Integer>();
        int i = 0,j = 0,k = 0;
        while(l.size() < (r * c)){
            if(visited[i][j] == 0){
                l.add(matrix[i][j]);
                visited[i][j] = 1;
                if(i == k && j < c - 1 - k) j++;
                else if(j == c - 1 - k && i < r - 1 - k) i++;
                else if(i == r - 1 - k && j <= c - 1 - k && j != k) j--;
                else if(i <= r - 1 - k && j == k) i--;
            }else{ 
                k++;
                i++;
                j++;
            }
        }
        return l;
    }
}