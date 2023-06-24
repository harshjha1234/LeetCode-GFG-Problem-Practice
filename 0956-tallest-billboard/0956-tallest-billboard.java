class Solution {
    
    public int tallestBillboard(int[] rods) {
        
        Map<String, Integer> map = new HashMap<>();
        int sum = 0;
        for (int rod : rods) {
            sum += rod;
        }
        return helper(rods, 0, 0, sum, map);
    }

    private int helper(int[] rods, int index, int diff, 
    int sum, Map<String, Integer> map) {

    if (index == rods.length) return (diff == 0) ? 0 : Integer.MIN_VALUE;
    

    String key = index + "+" + diff;

    if (map.containsKey(key)) return map.get(key);
    

    int exclude = helper(rods, index + 1, diff, sum, map);

    int taller = helper(rods, index + 1, 
    diff + rods[index], sum, map) + rods[index];

    int shorter = helper(rods, index + 1, 
    diff - rods[index], sum, map);

    int maxHeight = Math.max(exclude, Math.max(taller, shorter));

    map.put(key, maxHeight);
    return maxHeight;
    }
}