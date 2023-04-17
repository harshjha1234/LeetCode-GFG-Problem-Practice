class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> a = new ArrayList<>();
        funct(candidates, a, target, 0, new ArrayList<Integer>());
        return a;
    }
    public void funct(int[] c, List<List<Integer>> a, int target, int idx, List<Integer> t) {
        if (idx==c.length) {
            if (target==0) a.add(new ArrayList<>(t));
            return;
        }
        if (c[idx]<=target) {
            t.add(c[idx]);
            funct (c, a, target-c[idx], idx, t);
            t.remove(t.size()-1);
        }
        funct (c, a, target, idx+1, t);
    }
}
