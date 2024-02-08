//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class DriverClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            int V = sc.nextInt();
            int E = sc.nextInt();
            for (int i = 0; i < V; i++)
                list.add(i, new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                list.get(u).add(v);
            }
            if (new Solution().isCyclic(V, list) == true)
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
}
// } Driver Code Ends


/*Complete the function below*/

class Solution {
    // Function to detect cycle in a directed graph.
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        // code here
        boolean vis[] = new boolean[V];
        boolean dfs[] = new boolean[V];
        boolean ans = false;

        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                ans = check(adj, i, vis, dfs, ans);
                if (ans) return true;  // If a cycle is found in any DFS traversal, return true
            }
        }
        return ans;
    }

    public boolean check(ArrayList<ArrayList<Integer>> adj, int curr, boolean[] vis, boolean[] dfs, boolean ans) {
        vis[curr] = true;
        dfs[curr] = true;

        for (int i = 0; i < adj.get(curr).size(); i++) {
            int neigh = adj.get(curr).get(i);
            if (!vis[neigh]) {
                ans = check(adj, neigh, vis, dfs, ans);
                if (ans) return true;
            } else if (dfs[neigh]) {
                return true;  // Cycle detected
            }
        }
        dfs[curr] = false;
        return false;
    }
}