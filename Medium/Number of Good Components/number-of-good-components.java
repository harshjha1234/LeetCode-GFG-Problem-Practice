//{ Driver Code Starts
import java.io.*;
import java.util.*;

class IntMatrix {
    public static int[][] input(BufferedReader br, int n, int m) throws IOException {
        int[][] mat = new int[n][];

        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().trim().split(" ");
            mat[i] = new int[s.length];
            for (int j = 0; j < s.length; j++) mat[i][j] = Integer.parseInt(s[j]);
        }

        return mat;
    }

    public static void print(int[][] m) {
        for (var a : m) {
            for (int e : a) System.out.print(e + " ");
            System.out.println();
        }
    }

    public static void print(ArrayList<ArrayList<Integer>> m) {
        for (var a : m) {
            for (int e : a) System.out.print(e + " ");
            System.out.println();
        }
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            int e;
            e = Integer.parseInt(br.readLine());

            int v;
            v = Integer.parseInt(br.readLine());

            int[][] edges = IntMatrix.input(br, e, 2);

            Solution obj = new Solution();
            int res = obj.findNumberOfGoodComponent(e, v, edges);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends



class Solution {
    public static void dfs(int node, ArrayList<Integer> adj[], int size, int cv[], boolean flag[], int vis[]) {
        vis[node] = 1;
        cv[0]++;
        
        if(size != adj[node].size())
            flag[0] = false;
            
        for(int v: adj[node])
            if(vis[v] == 0)
                dfs(v, adj, size, cv, flag, vis);
    }
    public static int findNumberOfGoodComponent(int e, int v, int[][] edges) {
        // code here
        ArrayList<Integer> adj[] = new ArrayList[v + 1];
        for(int i = 1; i <= v; i++) 
            adj[i] = new ArrayList<>();
        
        for(int i = 0; i < e; i++) {
            int u = edges[i][0], w = edges[i][1];
            adj[u].add(w);
            adj[w].add(u);
        }
            
        int vis[] = new int[v + 1];
        int count = 0;
        
        for(int i = 1; i <= v; i++) {
            if(vis[i] == 0) {
                boolean flag[] = {true};
                int cv[] = {0};
                
                dfs(i, adj, adj[i].size(), cv, flag, vis);
                
                if(flag[0] == true && cv[0] == 1 + adj[i].size())
                    count++;
            }
        }
        
        return count;
    }
}
