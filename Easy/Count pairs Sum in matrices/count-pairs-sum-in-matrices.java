//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String input[] = read.readLine().split(" ");
            
            int n = Integer.parseInt(input[0]);
            int x = Integer.parseInt(input[1]);
            
            int mat1[][] = new int[n][n];
            
            for(int i = 0;i<n;i++){
                input = read.readLine().split(" ");
                for(int j = 0;j<n;j++){
                    mat1[i][j] = Integer.parseInt(input[j]);
                }
            }
            
            int mat2[][] = new int[n][n];
            
            for(int i = 0;i<n;i++){
                input = read.readLine().split(" ");
                for(int j = 0;j<n;j++){
                    mat2[i][j] = Integer.parseInt(input[j]);
                }
            }
            
        
            
            Solution ob = new Solution();
            System.out.println(ob.countPairs(mat1,mat2,n,x));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int countPairs(int mat1[][], int mat2[][], int n, int x) {
        // code here
         int r1=0, c1=0,r2=n-1,c2=n-1,cnt=0;
        
        while(r1<n && r2>=0){
            int sum = mat1[r1][c1]+mat2[r2][c2];
            if(sum<=x){
                if(sum==x) cnt++;
                if(c1<n-1)c1++; 
                else{
                    c1=0; 
                    r1++;
                }
            }else{
                if(c2>0){
                  c2--;
                }else{
                    c2=n-1; 
                    r2--;
                }  
            }
        }
        return cnt;
    }
}