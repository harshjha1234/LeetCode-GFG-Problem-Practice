class Solution {
    public int[] countBits(int n) {
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<=n; i++){
            list.add(Integer.bitCount(i));
        }
        int[] re = new int[list.size()];
        for(int i=0; i<re.length; i++){
            re[i] = list.get(i);
        }
        return re;
    }
}