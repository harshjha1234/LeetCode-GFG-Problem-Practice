//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    static class FastReader{ 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader(){ 
            br = new BufferedReader(new InputStreamReader(System.in)); 
        } 
  
        String next(){ 
            while (st == null || !st.hasMoreElements()){ 
                try{ st = new StringTokenizer(br.readLine()); } catch (IOException  e){ e.printStackTrace(); } 
            } 
            return st.nextToken(); 
        } 
  
        String nextLine(){ 
            String str = ""; 
            try{ str = br.readLine(); } catch (IOException e) { e.printStackTrace(); } 
            return str; 
        } 
        
        Integer nextInt(){
            return Integer.parseInt(next());
        }
    } 
    
    public static void main(String args[])
    {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        while(t>0)
        {
            int R = sc.nextInt();
            int C = sc.nextInt();
            
            char mat[][] = new char[R][C];
            for(int i=0;i<R;i++)
            {
                for(int j=0;j<C;j++)
                {
                    mat[i][j] = sc.next().charAt(0);
                }
            }
            String target  = sc.next();
            Solution obj = new Solution();
            System.out.println(obj.findOccurrence(mat,target));
            
            t--;
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    int countoc = 0;
    public int findOccurrence(char mat[][], String target)
    {
        // Write your code here
        int m = mat.length; 
         int n = mat[0].length;
         boolean vis [][] = new boolean[m][n];
         for(int r = 0; r< m; r++){
             for(int c = 0; c < n; c++){
                 if(mat[r][c] == target.charAt(0)) countoc += find(mat,target,vis,r,c,0);
             }
         }
         return countoc;
    }
    int find(char mat[][],String word, boolean vis[][],int r, int c, int index){
            if(r < 0 || c < 0 || r == vis.length || c == vis[0].length || vis[r][c] || word.charAt(index) != mat[r][c]) return 0;
            if(index == word.length()-1) return 1; 
            vis[r][c] = true;
            int top  = find(mat,word,vis,r-1,c,index+1);
            int down = find(mat,word,vis,r+1,c,index+1);
            int right= find(mat,word,vis,r,c+1,index+1);
            int left = find(mat,word,vis,r,c-1,index+1);
            vis[r][c] = false;
            return top + down + right + left;  
    }
}