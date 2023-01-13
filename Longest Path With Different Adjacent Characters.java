class Solution {
    int dist[] = new int[100005];
    int ans = 1;    
    public int longestPath(int[] parent, String s) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < parent.length; i++)
            adj.add(new ArrayList<Integer>());
        for (int i = 1; i < parent.length; i++)
            adj.get(parent[i]).add(i);

        dfs(0,s,adj);         
        return ans;     
    }
     void dfs(int src, String s , ArrayList<ArrayList<Integer>> adj){
        dist[src] = 1;
        for(int node : adj.get(src))
        {
            dfs(node, s, adj);
            if(s.charAt(src) != s.charAt(node)){
                ans = Math.max(ans, dist[src]+dist[node]);
                dist[src] = Math.max(dist[src], dist[node]+1);
            }
        }
    }
} 
