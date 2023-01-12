class Solution {
    int[] ans;
    int[] count;
    HashMap<Integer, List<Integer>> adj;
    String labels;

    private void dfs(int parent, int node){
        int index = labels.charAt(node) - 'a';
        int previous = count[index];
        count[index]++;

        for(int child: adj.get(node)){
            if(child != parent)
                dfs(node, child);
        }
        ans[node] = count[index] - previous;
    }

    public int[] countSubTrees(int n, int[][] edges, String labels){
        this.labels = labels;
        ans = new int[n];
        count = new int[26];
        adj = new HashMap<>();
        for(int[] edge: edges){
            int a = edge[0];
            int b = edge[1];
            adj.computeIfAbsent(a, node -> new ArrayList<>()).add(b);
            adj.computeIfAbsent(b, node -> new ArrayList<>()).add(a);
        }
        dfs(-1, 0);
        return ans;
    }
}
