class KthLargest {
  private PriorityQueue<Integer> h = new PriorityQueue<>();
  private int k;

  public KthLargest(int k, int[] nums) {
    this.k = k;
    for (var n : nums) add(n);
  }
  
  public int add(int val) {
    h.offer(val);
    if (h.size() > k) h.poll();
    return h.peek();
  }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */