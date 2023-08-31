class Solution {
    public int minTaps(int n, int[] ranges) {
        int[] is_reachable = new int[n+1];

        int inf = (int) 1e9;

        Arrays.fill(is_reachable, inf);
        is_reachable[0] = 0;

        for(int i = 0;i < ranges.length;i++){
            int mn = Math.max(0,i-ranges[i]);
            int mx = Math.min(n,i+ranges[i]);

            for(int j = mn;j < mx;j++){
                is_reachable[mx] = Math.min(is_reachable[mx],is_reachable[j]+1);
            }

        }

        return is_reachable[n] == inf ? -1 : is_reachable[n];
    }
}