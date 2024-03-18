//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tc = scan.nextInt();

        while (tc-- > 0) {
            int N = scan.nextInt();
            int M = scan.nextInt();
            int E = scan.nextInt();

            boolean graph[][] = new boolean[N][N];

            for (int i = 0; i < E; i++) {
                int u = scan.nextInt() - 1;
                int v = scan.nextInt() - 1;
                graph[u][v] = true;
                graph[v][u] = true;
            }

            System.out.println(new solve().graphColoring(graph, M, N) ? 1 : 0);
        }
    }
}

// } Driver Code Ends


class solve {
    // Function to determine if graph can be coloured with at most M colours
    // such
    // that no two adjacent vertices of graph are coloured with same colour.
    public boolean isSafe(int node,int co,boolean graph[][],int color[]){
        for(int i=0;i<graph.length;i++) if(graph[node][i] && color[i]==co) return false;
        return true;
    }
    public boolean canColor(boolean graph[][],int node,int color[],int m,int n){
        if(node==n) return true;
        for(int i=1;i<=m;i++){
            if(isSafe(node,i,graph,color)){
                color[node]=i;
                if(canColor(graph,node+1,color,m,n)) return true;
                color[node]=0;
            }
        }
        return false;
    }
    public boolean graphColoring(boolean graph[][], int m, int n) {
        // Your code here
        return canColor(graph,0,new int[n],m,n);
    }
}