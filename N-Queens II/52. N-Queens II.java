class Solution {
        int count = 0;
    public void total(int row ,int n , boolean[] cols,boolean[] nDiagnol,boolean[] rDiagnol){
        if(row==n){
            count++;
            return;
        }
        for(int col=0;col<n;col++){
            if(!cols[col] && !nDiagnol[row+col] && !rDiagnol[row-col+n-1]){
                cols[col]=true;
                nDiagnol[row+col]=true;
                rDiagnol[row-col+n-1]=true;
                total(row+1,n,cols,nDiagnol,rDiagnol);
                cols[col]=false;
                nDiagnol[row+col]=false;
                rDiagnol[row-col+n-1]=false;
            }
        }
    }
    public int totalNQueens(int n) {
        boolean[] cols = new boolean[n];
        boolean[] nDiagnol = new boolean[2*n-1];
        boolean[] rDiagnol = new boolean[2*n-1];
        total(0,n,cols,nDiagnol,rDiagnol);
        return count;
    }
}
