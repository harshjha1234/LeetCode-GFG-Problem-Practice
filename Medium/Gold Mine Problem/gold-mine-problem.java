//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String inline[] = in.readLine().trim().split("\\s+");
            int n = Integer.parseInt(inline[0]);
            int m = Integer.parseInt(inline[1]);
            String inline1[] = in.readLine().trim().split("\\s+");
            int M[][] = new int[n][m];
            for(int i = 0;i < n*m;i++){
                M[i/m][i%m] = Integer.parseInt(inline1[i]);
            }
            
            Solution ob = new Solution();
            System.out.println(ob.maxGold(n, m, M));
        }
    }
} 
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int maxGold(int n, int m, int M[][])
    {
        // code here
        int mg = 0;
        for(int j=1; j<m; j++){
            // int sum = 0;
            for(int i =0; i<n; i++){
                int dd = 0, du = 0, r = 0;
                if(i-1 >= 0){
                    r = M[i-1][j-1];
                }
                dd = M[i][j-1];
                if(i+1<n){
                    du = M[i+1][j-1];
                }
                M[i][j] += Math.max(r, Math.max(du, dd));
                if(M[i][j] > mg){
                    mg = M[i][j];
                }
            }
        }
        return mg;
    }
}