class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
       List<List<Integer>> groupedPeople = new ArrayList<>();

        Map<Integer, List<Integer>> groupMap = new HashMap<>();

        for (int personID = 0; personID < groupSizes.length; personID++) {
            int desiredGroupSize = groupSizes[personID];

            groupMap.computeIfAbsent(desiredGroupSize, k -> new ArrayList<>()).add(personID);

            if (groupMap.get(desiredGroupSize).size() == desiredGroupSize) {
                groupedPeople.add(List.copyOf(groupMap.get(desiredGroupSize)));

                groupMap.get(desiredGroupSize).clear();
            }
        }

        return groupedPeople; 
    }
}