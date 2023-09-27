class Solution {
    public String mergeAlternately(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        String newstr = new String();
        for(int i=0; i<(m>n?m:n); i++){
            if(i<m){
                newstr=newstr+word1.charAt(i);
            }
            if(i<n){
                newstr=newstr+word2.charAt(i);
            }
        }
        return newstr;
    }
}