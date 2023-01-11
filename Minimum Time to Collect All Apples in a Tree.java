class Solution {
    public int minTime(int n, int[][] edges, List<Boolean> hasApple) {
        List<List<Integer>> map = new ArrayList<>();

        for(int i=0;i<n;i++)
        {
            map.add(new ArrayList<Integer>(0));
        }
        boolean visited[] = new boolean[n];

        for(int[] e:edges){
            map.get(e[0]).add(e[1]);
            map.get(e[1]).add(e[0]);
        }

        return dfs(map,visited,hasApple,0);
    }

    private int dfs(List<List<Integer>> map,boolean[] visited,List<Boolean> hasApple,int index)
    {
        int result = 0;
        visited[index] = true;

        for(int i:map.get(index))
        {
            if(!visited[i])
            {
                result += dfs(map,visited,hasApple,i);
            }
        }

        if(index == 0)
        {
            return result;
        }
        return result+=(hasApple.get(index) || result>0)?2:0;
    }
}
