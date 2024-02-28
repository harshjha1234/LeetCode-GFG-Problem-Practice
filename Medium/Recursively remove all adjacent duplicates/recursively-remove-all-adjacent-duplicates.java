//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
        while(t-->0){
            String S = br.readLine();
            Solution ob = new Solution();
            String ans = ob.rremove(S).trim();
            if(ans.length() == 0)
                System.out.println();
            else
                System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    String rremove(String s) {
        // code here
        StringBuilder result = new StringBuilder();
        int i = 0;
        int n = s.length();
        
        while (i < n) {
            int j = i;
            while (j < n && s.charAt(j) == s.charAt(i)) {
                j++;
            }
            
            if (j - i > 1) {
                i = j;
            } else {
                result.append(s.charAt(i));
                i++;
            }
        }
        if (result.length() < n) {
            return rremove(result.toString());
        } else {
            return result.toString();
        }
    }
}