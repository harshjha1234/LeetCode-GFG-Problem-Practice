class Solution {
    public List<Integer> getRow(int rowIndex) {
         List<Integer> s = new ArrayList<>();
        for(int i = 0; i <= rowIndex; i++) {
            s.add(1);
            for(int j = i-1; j > 0; j--) {
                s.set(j, s.get(j-1) + s.get(j));
            }
        }
        return s;
    }
}
