class Solution {
    public String longestCommonPrefix(String[] strs) {
       if (strs == null || strs.length == 0) {  // check if the input array is empty or null
        return "";
    }
    String prefix = strs[0];   // assume the first string is the prefix
    for (int i = 1; i < strs.length; i++) {
        while (strs[i].indexOf(prefix) != 0) {   // keep reducing the prefix until it matches the current string
            prefix = prefix.substring(0, prefix.length() - 1);
            if (prefix.isEmpty()) {   // if the prefix becomes empty, return an empty string
                return "";
            }
        }
    }
    return prefix; 
    }
}
