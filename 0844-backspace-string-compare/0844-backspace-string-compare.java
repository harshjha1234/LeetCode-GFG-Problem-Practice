class Solution {
public static int nextChar(String str, int cur){
    while(cur > -1 && str.charAt(cur) == '#'){
        int cnt = 1;
        for(cur--; cur > -1 && cnt > 0; cur--)
            cnt += str.charAt(cur) == '#'? 1 : -1;
    }
    return cur;
}
public boolean backspaceCompare(String s, String t) {
    int i = nextChar(s, s.length() - 1);
    int j = nextChar(t, t.length() - 1);
    while(i > -1 && j > -1){
        if(s.charAt(i) != t.charAt(j)) return false;
        i = nextChar(s, i - 1);
        j = nextChar(t, j - 1);
    }
    if(i == -1 && j == -1) return true;
    return false;
}
}