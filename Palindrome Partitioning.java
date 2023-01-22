class Solution {
     boolean palind(String s) {
        String a = new StringBuilder(s).reverse().toString();
        if (a.equals(s)) {
            return true;
        } else {
            return false;
        }
    }
    
    void call(int ind, List<List<String>> ans, List<String> vec, String s) {
        if (ind == s.length()) {
            ans.add(new ArrayList<String>(vec));
        }
        
        for (int i = ind; i < s.length(); i++) {
            if (palind(s.substring(ind, i + 1))) {
                vec.add(s.substring(ind, i + 1));
                call(i + 1, ans, vec, s);
                vec.remove(vec.size() - 1);
            }
        }
    }
    
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<List<String>>();
        List<String> vec = new ArrayList<String>();
        call(0, ans, vec, s);
        return ans;
    }
}
