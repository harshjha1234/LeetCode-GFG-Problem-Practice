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
            int N = Integer.parseInt(br.readLine().trim());
            String[] S1 = br.readLine().trim().split(" ");
            String[] S2 = br.readLine().trim().split(" ");
            int[] KnightPos = new int[2];
            int[] TargetPos = new int[2];
            for(int i = 0; i < 2; i++){
                KnightPos[i] = Integer.parseInt(S1[i]);
                TargetPos[i] = Integer.parseInt(S2[i]);
            }
            Solution obj = new Solution();
            int ans = obj.minStepToReachTarget(KnightPos, TargetPos, N);
            System.out.println(ans);
       }
    }
}

// } Driver Code Ends


class Solution
{
    //Function to find out minimum steps Knight needs to reach target position.
    public class triplet{
        int r,c,step;//rows,columns,steps
        triplet(int r,int c,int step){
            this.r=r;
            this.c=c;
            this.step=step;
        }
    }
    public int minStepToReachTarget(int KnightPos[], int TargetPos[], int N)
    {
        // Code here
        int kr=KnightPos[0];   //row at knight is present
        int kc=KnightPos[1];   //column at knight is present
        int tr=TargetPos[0];   //row at target is present
        int tc=TargetPos[1];   //column at target is present
        kr--;kc--;tr--;tc--;   //setting indexes as per standard ,i.e,from 0 to n-1
        
        boolean visited[][]=new boolean[N][N];
        Queue<triplet> q=new ArrayDeque<>();
        q.add(new triplet(kr,kc,0));
        visited[kr][kc]=true;
        
        int ans=0;
        
        while(!q.isEmpty()){
            triplet curr=q.poll();
            int x=curr.r,y=curr.c,s=curr.step;
            ans=Math.max(ans,s);
            if(tr==x && tc==y){
                return ans;
            }
            //8 ways that knight moves on chess are as follows:-
            if(x+1>=0 && x+1<N && y+2>=0 && y+2<N){
                if(visited[x+1][y+2]==false){
                    visited[x+1][y+2]=true;
                    q.add(new triplet(x+1,y+2,s+1));
                }
            }
            if(x+1>=0 && x+1<N && y-2>=0 && y-2<N){
                if(visited[x+1][y-2]==false){
                    visited[x+1][y-2]=true;
                    q.add(new triplet(x+1,y-2,s+1));
                }
            }
            if(x-1>=0 && x-1<N && y+2>=0 && y+2<N){
                if(visited[x-1][y+2]==false){
                    visited[x-1][y+2]=true;
                    q.add(new triplet(x-1,y+2,s+1));
                }
            }
            if(x-1>=0 && x-1<N && y-2>=0 && y-2<N){
                if(visited[x-1][y-2]==false){
                    visited[x-1][y-2]=true;
                    q.add(new triplet(x-1,y-2,s+1));
                }
            }
            if(x+2>=0 && x+2<N && y+1>=0 && y+1<N){
                if(visited[x+2][y+1]==false){
                    visited[x+2][y+1]=true;
                    q.add(new triplet(x+2,y+1,s+1));
                }
            }
            if(x-2>=0 && x-2<N && y+1>=0 && y+1<N){
                if(visited[x-2][y+1]==false){
                    visited[x-2][y+1]=true;
                    q.add(new triplet(x-2,y+1,s+1));
                }
            }
            if(x+2>=0 && x+2<N && y-1>=0 && y-1<N){
                if(visited[x+2][y-1]==false){
                    visited[x+2][y-1]=true;
                    q.add(new triplet(x+2,y-1,s+1));
                }
            }
            if(x-2>=0 && x-2<N && y-1>=0 && y-1<N){
                if(visited[x-2][y-1]==false){
                    visited[x-2][y-1]=true;
                    q.add(new triplet(x-2,y-1,s+1));
                }
            }
        }
        
        return -1;
    }
}