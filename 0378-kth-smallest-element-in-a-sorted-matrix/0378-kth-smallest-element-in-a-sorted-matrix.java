class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        int n=matrix.length;
        int m=matrix[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(pq.size()>k)
                {
                    pq.poll();
                }
                pq.add(matrix[i][j]);
            }
        }
        if(pq.size()>k)
                {
                    pq.poll();
                }
        return pq.peek();
    }
}