class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> p = new PriorityQueue<>();
        for (int x : nums) {
            p.offer(x);
            if (p.size() > k) {
                p.poll();
            }
        }
        return p.peek();
    }
}