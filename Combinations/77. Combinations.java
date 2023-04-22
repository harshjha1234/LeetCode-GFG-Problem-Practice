class Solution {
    public List<List<Integer>> combine(int n, int k) {
         List<List<Integer>> r = new ArrayList<>();
        helper(n, k, 1,  r, new ArrayList<>());
        return r;
    }
    private void helper(int n, int k, int idex, List<List<Integer>> r, List<Integer> t){
        if(t.size()==k){
            r.add(new ArrayList<>(t));
            return;
        }
        for(int i = idex; i<=n;i++){
            t.add(i);
            helper(n, k, i+1, r, t);
            t.remove(t.size()-1);
        }
    }
}
