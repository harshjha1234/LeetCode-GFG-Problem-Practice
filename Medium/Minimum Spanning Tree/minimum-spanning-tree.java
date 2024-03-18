//{ Driver Code Starts


import java.util.*;
import java.io.*;
import java.lang.*;

public class Main{
	static BufferedReader br;
	static PrintWriter ot;
    public static void main(String args[]) throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		ot = new PrintWriter(System.out);
		int t = Integer.parseInt(br.readLine().trim());
		while(t-- > 0){
			String s[] = br.readLine().trim().split(" ");
			int V = Integer.parseInt(s[0]);
			int E = Integer.parseInt(s[1]);
			int edges[][] = new int[E][3];
			for(int i = 0; i < E; i++){
				s = br.readLine().trim().split(" ");
				edges[i][0] = Integer.parseInt(s[0]);
				edges[i][1] = Integer.parseInt(s[1]);
				edges[i][2] = Integer.parseInt(s[2]);
			}
			ot.println(new Solution().spanningTree(V, E, edges));
		}
		ot.close();
	}
}
// } Driver Code Ends


// User function Template for Java

class Solution{
    static class pair{
        int v,w;
        pair(int v,int w){
            this.v=v;
            this.w=w;
        }
    }
	static int spanningTree(int V, int E, int edges[][]){
	    // Code Here. 
	    ArrayList<ArrayList<ArrayList<Integer>>> adj
	                           =new ArrayList<ArrayList<ArrayList<Integer>>>();              
	    for(int i=0;i<V;i++){
	        adj.add(new ArrayList<ArrayList<Integer>>());
	    }
	    
	     // making undirected graph in form of adjoint list: 
	     
	    for(int i=0;i<E;i++){
	        int u=edges[i][0];
	        ArrayList<Integer> temp=new ArrayList<>();
	        temp.add(edges[i][1]);
	        temp.add(edges[i][2]);
	        adj.get(u).add(temp);
	        
	        int v=edges[i][1];
	        ArrayList<Integer> temp2=new ArrayList<>();
	        temp2.add(edges[i][0]);
	        temp2.add(edges[i][2]);
	        adj.get(v).add(temp2);
	    }
	    
	    //USING PRIM'S ALGORITHM :
	    
	    boolean[] mst=new boolean[V];
	    int[] key=new int[V];
	    Arrays.fill(key,Integer.MAX_VALUE);
	    key[0]=0;
	    PriorityQueue<pair> pq=new PriorityQueue<>((a,b)->a.w-b.w);
	    pq.add(new pair(0,0));
	    int res=0;
	    
	    while(!pq.isEmpty()){
	        pair curr=pq.poll();
	        int u=curr.v,w=curr.w;
	        if(mst[u]==false){
	            res+=w;
	            mst[u]=true;
	        }
	        
	        for(ArrayList<Integer> a:adj.get(u)){
	            int v=a.get(0);
	            int weight=a.get(1);
	            if(mst[v]==false && key[v]>weight){
	                key[v]=weight;
	                pq.add(new pair(v,key[v]));
	            }
	        }
	    }
	    
	    return res;
	}
}