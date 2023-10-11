class Solution {
    public int[] fullBloomFlowers(int[][] flowers, int[] people) {
        int[] sortedArrivalTimes = Arrays.copyOf(people, people.length);
        Arrays.sort(sortedArrivalTimes);

        Arrays.sort(flowers, Comparator.comparingInt(flower -> flower[0]));

        Map<Integer, Integer> bloomCounts = new HashMap<>();  
        PriorityQueue<Integer> bloomEndTimes = new PriorityQueue<>();  
        int flowerIdx = 0;
        for (int personTime : sortedArrivalTimes) {
            while (flowerIdx < flowers.length && flowers[flowerIdx][0] <= personTime) {
                bloomEndTimes.offer(flowers[flowerIdx][1]);
                flowerIdx++;
            }

            while (!bloomEndTimes.isEmpty() && bloomEndTimes.peek() < personTime) {
                bloomEndTimes.poll();
            }

            bloomCounts.put(personTime, bloomEndTimes.size());
        }

        int[] flowerCounts = new int[people.length];  
        for (int i = 0; i < people.length; i++) {
            flowerCounts[i] = bloomCounts.get(people[i]);
        }

        return flowerCounts;
    }
}