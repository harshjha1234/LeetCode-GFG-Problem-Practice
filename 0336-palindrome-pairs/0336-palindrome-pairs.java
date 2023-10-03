class Solution {
    public List<List<Integer>> palindromePairs(String[] words) {
        HashMap<String,Integer> wMap = new HashMap<>();
        Set<Integer> set = new TreeSet<>();//Sorted Set
        int n = words.length;
        
        for(int i=0;i<n;i++){
            wMap.put(words[i],i);
            set.add(words[i].length());
        }
        
        List<List<Integer>> ans = new ArrayList<>();
        
        for(int i=0;i<n;i++){
            int length = words[i].length();
            
            if(length ==1){
                if(wMap.containsKey("")){
                    ans.add(Arrays.asList(i, wMap.get("")));
                    ans.add(Arrays.asList(wMap.get(""), i));
                }
                continue;
            }
            String reverse= new StringBuilder(words[i]).reverse().toString();
            if(wMap.containsKey(reverse) && wMap.get(reverse) != i)
                ans.add(Arrays.asList(i,wMap.get(reverse)));
            
            for(Integer k:set){
                if(k==length)
                    break;
                if(isPalindrome(reverse,0,length-1-k)){
                    String s1 = reverse.substring(length-k);
                    if(wMap.containsKey(s1))
                        ans.add(Arrays.asList(i,wMap.get(s1)));
                }
                
                if(isPalindrome(reverse,k,length-1)){
                    String s2 = reverse.substring(0,k);
                    if(wMap.containsKey(s2))
                        ans.add(Arrays.asList(wMap.get(s2),i));
                }
            }
        }
        return ans;
    }
    
    private boolean isPalindrome(String s, int left, int right){
        while(left<right)
            if(s.charAt(left++)!=s.charAt(right--))
                return false;
        return true;
    }
}