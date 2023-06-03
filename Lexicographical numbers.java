class Solution {

    public List<Integer> lexicalOrder(int n) {

      List<Integer> list = new ArrayList<>();

        String[] str = new String[n];

        for(int i=1;i<=n;i++) str[i-1] = Integer.toString(i);

        Arrays.sort(str);

        for(String s: str) list.add(Integer.parseInt(s));

        return list;  

    }

}
