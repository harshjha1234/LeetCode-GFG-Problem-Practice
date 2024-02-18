//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String s = in.readLine();
            int k = Integer.parseInt(in.readLine());
            
            Solution ob = new Solution();
            System.out.println(ob.minValue(s, k));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution{
    static int minValue(String s, int k){
        // code here
        int n = s.length();
        Map<Character, Integer> m = new HashMap<>();
        for(int i=0; i<n; i++){
            m.put(s.charAt(i), m.getOrDefault(s.charAt(i), 0)+1);
        }
        while(k>0){
            Character t = Collections.max(m.entrySet(), Map.Entry.comparingByValue()).getKey();
            m.put(t,m.get(t)-1);
            k--;
        }
        int res = 0;
        for(Character j: m.keySet()){
            res += Math.pow(m.get(j), 2);
        }
        return res;
    }
}