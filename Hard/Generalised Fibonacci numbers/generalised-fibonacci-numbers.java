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
            String S[] = read.readLine().split(" ");
            
            long a = Long.parseLong(S[0]);
            long b = Long.parseLong(S[1]);
            long c = Long.parseLong(S[2]);
            long n = Long.parseLong(S[3]);
            long m = Long.parseLong(S[4]);

            Solution ob = new Solution();
            System.out.println(ob.genFibNum(a,b,c,n,m));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static long[][]multiply(long[][] A,long[][] B,long m){
        int size=A.length;
        long[][] result=new long[size][size];
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                for(int k=0;k<size;k++){
                    result[i][j]=(result[i][j]+(A[i][k]%m*B[k][j]%m)%m)%m;
                }
            }
        }
        return result;
    }
    static long[][] power(long[][] mat,long R,long m){
        if(R==1){
            return mat;
        }
        long ans[][]=power(mat,R/2,m);
        ans=multiply(ans,ans,m);
        if(R%2==1){
            ans=multiply(ans,mat,m);
        }
        return ans;
    }
    static long genFibNum(Long a, Long b, Long c, long n, long m) {
        // code here
        if(n<=2){
            return 1%m;
        }
        long mat[][]={{a,b,1},{1,0,0},{0,0,1}};
        long ans[][]=power(mat,n-2,m);
        return (ans[0][0]+ans[0][1]+ans[0][2]*c)%m;
    }
};