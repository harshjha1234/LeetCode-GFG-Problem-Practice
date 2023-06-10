class Solution {
    public int[] findRightInterval(int[][] intervals) {
       int[] r = new int[intervals.length];
        Map<Integer, Integer> m = new HashMap<>();
        int max = Integer.MIN_VALUE;

        for(int i=0; i<intervals.length; i++) {
            int[] interval = intervals[i];
            max = Math.max(max, interval[0]);
            m.put(interval[0], i);
        }
        
        for(int i=0; i<intervals.length; i++){
            int end = intervals[i][1];
            if(end > max) {
                r[i] = -1;
                continue;
            }
            int j = end;
            while(!m.containsKey(j)) {
                j++;
            }
            r[i] = m.get(j);
        }

        return r; 
    }
}