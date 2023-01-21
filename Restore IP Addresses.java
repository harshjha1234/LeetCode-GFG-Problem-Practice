class Solution {
    public List<String> restoreIpAddresses(String s) {
        if(s == null) return new ArrayList<>();
        
        ArrayList<String> res = new ArrayList<>();
        int n = s.length();
        
        for(int i = 1; i < Math.min(n, 4); i++)
        {
            String[] currentIPAddressParts = new String[] {"", "", "", ""};
            currentIPAddressParts[0] = s.substring(0, i);
            
            if(!isValidPart(currentIPAddressParts[0]))
                continue;
            
            for(int j = i+1; j < i + Math.min(n-i, 4); j++)
            {
                currentIPAddressParts[1] = s.substring(i, j);
                
                if(!isValidPart(currentIPAddressParts[1]))
                    continue;
                
                for(int k = j+1; k < j + Math.min(n-j, 4); k++)
                {
                    currentIPAddressParts[2] = s.substring(j, k);
                    currentIPAddressParts[3] = s.substring(k);
                    
                    if(isValidPart(currentIPAddressParts[2]) && isValidPart(currentIPAddressParts[3]))
                        res.add(join(currentIPAddressParts));
                }
            }
        }
        return res;
    }
    
    public boolean isValidPart(String str)
    {
        int n = str.length();
        
        if(n > 3)   return false;
        
        return (str.charAt(0) != '0') ? (Integer.valueOf(str) <= 255) : (n == 1);
    }
    
    public String join(String[] strs)
    {
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < strs.length; i++)
        {
            sb.append(strs[i]);
            
            if(i != strs.length-1)
                sb.append(".");
        }
        return sb.toString();
    }
}
