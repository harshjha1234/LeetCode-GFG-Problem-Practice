class Solution {
    public boolean canCross(int[] stones) {
        HashMap<Integer, HashSet<Integer>> jumpMap = new HashMap<>();
        
        jumpMap.put(0, new HashSet<>());
        jumpMap.get(0).add(1); 
        
        for (int i = 1; i < stones.length; i++) {
            jumpMap.put(stones[i], new HashSet<>());
        }
        
        for (int i = 0; i < stones.length - 1; i++) {
            int stonePos = stones[i];
            HashSet<Integer> jumpDistances = jumpMap.get(stonePos);
            
            for (int jumpDistance : jumpDistances) {
                int nextPos = stonePos + jumpDistance;
                if (nextPos == stones[stones.length - 1]) {
                    return true; 
                }
                
                HashSet<Integer> nextJumpDistances = jumpMap.get(nextPos);
                if (nextJumpDistances != null) {
                    nextJumpDistances.add(jumpDistance);
                    if (jumpDistance > 1) {
                        nextJumpDistances.add(jumpDistance - 1);
                    }
                    nextJumpDistances.add(jumpDistance + 1);
                }
            }
        }
        
        return false; 
    }
}