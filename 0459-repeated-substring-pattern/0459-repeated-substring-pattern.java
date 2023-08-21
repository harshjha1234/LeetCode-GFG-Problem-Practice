class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String concat = s + s;
        String res = concat.substring(1, concat.length() -1);
        return res.contains(s);
    }
}