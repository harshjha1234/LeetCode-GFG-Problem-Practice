class Solution {
    public long totalCost(int[] costs, int k, int candidates) {
        int l = 0; 
        int r = costs.length - 1;
        PriorityQueue<int[]> L = new PriorityQueue<>(r+1, (int[] o1, int[] o2) ->{
            if(o2[0] != o1[0]) {
                return o1[0] - o2[0];
            }
            return o1[1] - o2[1]; 
        });
        PriorityQueue<int[]> R = new PriorityQueue<>(r+1, (int[] o1, int[] o2) ->{
            if(o2[0] != o1[0]) {
                return o1[0] - o2[0];
            }
            return o1[1] - o2[1]; 
        });
        long ans = 0;

        while(k-- != 0){
          while(l <= r && L.size() < candidates) {
              L.add( new  int[]{costs[l], l}); l++;
          }
          while(l <= r && R.size() < candidates) {
              R.add( new  int[]{costs[r], r}); r--;
          }

          if(L.isEmpty()){
              ans += R.poll()[0];
          }
          else if(R.isEmpty()){              
              ans += L.poll()[0];
          }  
          else if(L.peek()[0] <= R.peek()[0]) {
              ans += L.poll()[0];
          }
          else {                              
              ans += R.poll()[0]; 
          }
        }

        return ans;  
    }
}