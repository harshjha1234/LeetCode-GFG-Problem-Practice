class Solution {
    public char findTheDifference(String s, String t) {
        char ans = 0;
        for(char i : s.toCharArray()){
            ans ^= i;
        }
        for(char j : t.toCharArray()){
            ans ^= j;
        }
        return ans;    }
}