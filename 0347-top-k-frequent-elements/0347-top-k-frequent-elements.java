class Solution {
    public int[] topKFrequent(int[] nums, int k) {
         return nums.length == k ? nums : 
            Arrays.stream(nums).boxed().collect(
                Collectors.groupingBy(e -> e, Collectors.summingInt(e -> 1))
            )
            .entrySet().stream().sorted(
                Map.Entry.comparingByValue((a, b) -> Integer.compare(b, a))
            )
            .limit(k).mapToInt(e -> e.getKey()).toArray();
    }
}