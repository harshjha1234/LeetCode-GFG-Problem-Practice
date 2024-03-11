//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            int[][] grid = new int[n][m];
            for(int i = 0; i < n; i++){
                String[] S = br.readLine().trim().split(" ");
                for(int j = 0; j < m; j++){
                    grid[i][j] = Integer.parseInt(S[j]);
                }
            }
            Solution obj = new Solution();
            int ans = obj.orangesRotting(grid);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


class Solution
{
    //Function to find minimum time required to rot all oranges. 
    public class triplet{
        int r,c,step;
        triplet(int r,int c,int step){
            this.r=r;
            this.c=c;
            this.step=step;
        }
    }
    public int orangesRotting(int[][] grid)
    {
        // Code here
        int r=grid.length;   
        int c=grid[0].length;
        int ans=0;
        
        boolean visited[][]=new boolean[r][c];
        Queue<triplet> q=new ArrayDeque<>();
        
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]==2){
                    q.add(new triplet(i,j,0));
                    visited[i][j]=true;
                }
            }
        }
        
        while(!q.isEmpty()){
            triplet temp=q.poll();
            int x=temp.r,y=temp.c,s=temp.step;
            ans=Math.max(ans,s);
            
            int r1=x-1,r2=x+1;
            int c1=y-1,c2=y+1;
            
            if(r1>=0 && r1<r){
                if(visited[r1][y]==false && grid[r1][y]==1){
                    q.add(new triplet(r1,y,s+1));
                    visited[r1][y]=true;
                }
            }
            if(r2>=0 && r2<r){
                if(visited[r2][y]==false && grid[r2][y]==1){
                    q.add(new triplet(r2,y,s+1));
                    visited[r2][y]=true;
                }
            }
            if(c1>=0 && c1<c){
                if(visited[x][c1]==false && grid[x][c1]==1){
                    q.add(new triplet(x,c1,s+1));
                    visited[x][c1]=true;
                }
            }
            if(c2>=0 && c2<c){
                if(visited[x][c2]==false && grid[x][c2]==1){
                    q.add(new triplet(x,c2,s+1));
                    visited[x][c2]=true;
                }
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(visited[i][j]==false && grid[i][j]!=0){
                    return -1;
                }
            }
        }
        return ans;
    }
}