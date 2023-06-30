class Solution {
    public int latestDayToCross(int row, int col, int[][] cells) {
        int grid[][] = new int[row][col];
        for(int i=0;i<cells.length;i++){
            grid[cells[i][0]-1][cells[i][1]-1]=i+1;
        }
        int low = 0 , high = cells.length,ans=-1;
        while(low<high){
            int day = high-(high-low) / 2;
            boolean isWay=false;
            for(int i=0;i<col && !isWay;i++){
                boolean[][] tgrid = new boolean[row][col];
                isWay = isWay||DFS(0,i,row,col,grid,day,tgrid);
            }
            if(isWay){
                low=day;
                ans=day;
            }
            else{
                high=day-1;
            }
        }
        return ans;
    }
    boolean DFS(int i , int j , int row, int col, int[][] grid, int day, boolean[][] tgrid){
        if(i<0 || j<0 || i>=row || j>=col || grid[i][j]<=day || tgrid[i][j]==true) return false;
        tgrid[i][j]=true;
        if(i==row-1) return true;
        return DFS(i+1,j,row,col,grid,day,tgrid) 
            || DFS(i,j+1,row,col,grid,day,tgrid) 
            || DFS(i-1,j,row,col,grid,day,tgrid) 
            || DFS(i,j-1,row,col,grid,day,tgrid); 
    }
}