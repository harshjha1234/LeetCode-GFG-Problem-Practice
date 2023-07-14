class Solution {
    public int longestSubsequence(int[] arr, int difference) {
        int N = arr.length;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(arr[N-1],0);
        int ans = 0;

        for(int i=N-2; i>=0; i--){
            if(map.containsKey(arr[i]+difference)){
                int temp = map.get(arr[i]+difference)+1;
                map.put(arr[i],temp);
                ans = Math.max(ans,temp);
            }
            else
                map.put(arr[i],0);
        }
        return ans+1;
    }
}