class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        PriorityQueue<int[]> minHeap = new PriorityQueue<>(
            (a, b) -> (nums1[a[0]] + nums2[a[1]]) - (nums1[b[0]] + nums2[b[1]])
        );
        for (int i = 0; i < nums1.length; i++) {
            minHeap.add(new int[] { i , 0 });
        }

        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            if (minHeap.isEmpty()) break;

            int[] minPairIndexes = minHeap.remove();
            int indexList1 = minPairIndexes[0], indexList2 = minPairIndexes[1];
            List<Integer> res = Arrays.asList(nums1[indexList1], nums2[indexList2]);
            result.add(res);

            if (indexList2 < nums2.length - 1) {
                minHeap.add(new int[] { indexList1 , indexList2 + 1 });
            }
        }
        
        return result;
    }
}