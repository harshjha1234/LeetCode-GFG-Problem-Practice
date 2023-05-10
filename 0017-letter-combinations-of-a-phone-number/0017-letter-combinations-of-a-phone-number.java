class Solution {
    public List<String> letterCombinations(String digits) {
        int n = digits.length();
        String[] arr = {"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        ArrayList<String> l = new ArrayList<String>();
        if(n == 0) return l;
        Queue<String> q = new LinkedList<String>();
        q.add("");
        while (!q.isEmpty()) {
            String s = q.remove();
            if (s.length() != n){
                String val = arr[(digits.charAt(s.length()) - '0') - 2];
                for (int i=0;i<val.length();i++) q.add(s + val.charAt(i));
            }
            else l.add(s);
        }
        return l;
    }
}