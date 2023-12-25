//{ Driver Code Starts
import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int matrix[][] = new int[n][n];
            
            for(int i = 0; i < n; i++)
            {
                for(int j = 0; j < n; j++)
                  matrix[i][j] =sc.nextInt();
            }
            Solution ob = new Solution();
            System.out.println(ob.determinantOfMatrix(matrix, n));
        }
    }
}
// } Driver Code Ends




class Solution
{
    static int helper(int matrix[][],int n){
        if(n==2){
            return ((matrix[0][0]*matrix[1][1])-(matrix[0][1]*matrix[1][0]));
        }
        int ans = 0;
        for(int i=0;i<n;i++){
            if(matrix[0][i]==0){
                if(i%2!=0) {
                    ans-=0;
                }else {
                    ans+=0;
                }
            }
            else{
                int part[][] = getPart(matrix,n,i);
                if(i%2!=0) {
                    ans-=(matrix[0][i]*helper(part,part.length));
                }else {
                    ans+=(matrix[0][i]*helper(part,part.length));
                }
            }
        }
        return ans;
    }
    static int[][] getPart(int matrix[][],int n,int col){
        int part[][] = new int[n-1][n-1];
        int r = 0;
        for(int i=1;i<n;i++){
            int c = 0;
            for(int j=0;j<n;j++){
                if(j!=col){
                  part[r][c++] = matrix[i][j];  
                }
            }
            r++;
        }
        return part;
    }
    //Function for finding determinant of matrix.
    static int determinantOfMatrix(int matrix[][], int n)
    {
        // code here 
        if(n==1) {
            return matrix[0][0];
        }
        if(n==2) {
            return ((matrix[0][0]*matrix[1][1])-(matrix[0][1]*matrix[1][0]));
        }
        return helper(matrix,n);
        
    }
}

