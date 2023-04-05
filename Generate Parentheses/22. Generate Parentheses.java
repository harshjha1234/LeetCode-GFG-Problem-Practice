class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList();
        findAll("(",1,0,res,n);

        return res;
    }

    void findAll(String c, int op, int cl, List<String> res, int n){
        if(c.length() == 2*n){
            res.add(c);
            return;
        }
        if(op < n)
        findAll(c+"(", op+1, cl, res, n);
        if(cl < op)
        findAll(c+ ")", op, cl+1, res, n);
    }
}
