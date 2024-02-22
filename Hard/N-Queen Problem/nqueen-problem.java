//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0) {
            int n = Integer.parseInt(in.readLine());
            
            Solution ob = new Solution();
            ArrayList<ArrayList<Integer>> ans = ob.nQueen(n);
            if(ans.size() == 0)
                System.out.println("-1");
            else {
                for(int i = 0;i < ans.size();i++){
                    System.out.print("[");
                    for(int j = 0;j < ans.get(i).size();j++)
                        System.out.print(ans.get(i).get(j) + " ");
                    System.out.print("] ");
                }
                System.out.println();
            }
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution{
    public static void find(int[][] nums,int[] left,int[] lowd,int[] upperd,int col,int n,ArrayList<ArrayList<Integer>> ans){
        if(col==n){
            ArrayList<Integer> ars=new ArrayList<Integer>();
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    if(nums[j][i]==1){
                        ars.add(j+1);
                    }
                }
            }
            
            ans.add(new ArrayList<>(ars));
            return;
        }
        
        
        for(int row=0; row<n; row++){
            if(left[row]==0 && lowd[row+col]==0 && upperd[n-1 + col-row]==0){
                nums[row][col]=1;
                left[row]=1;
                lowd[row+col]=1;
                upperd[n-1 + col-row]=1;
                find(nums,left,lowd,upperd,col+1,n,ans);
                nums[row][col]=0;
                left[row]=0;
                lowd[row+col]=0;
                upperd[n-1 + col-row]=0;
                
            }
        }
    }
    static ArrayList<ArrayList<Integer>> nQueen(int n) {
        // code here
        int[][] m=new int[n][n];
        int[] left=new int[n];
        int[] lowd=new int[2*n-1];
        int[] upperd=new int[2*n-1];
        
        ArrayList<ArrayList<Integer>> ans=new ArrayList<ArrayList<Integer>>();
        
        find(m,left,lowd,upperd,0,n,ans);
        return ans;
    }
}