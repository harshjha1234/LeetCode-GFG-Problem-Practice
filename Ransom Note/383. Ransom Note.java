class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] c = new int[128];
        for (final char ch : magazine.toCharArray())
            ++c[ch];
        for (final char ch : ransomNote.toCharArray())
            if (--c[ch] < 0)
                return false;
        return true;  
    }
}
