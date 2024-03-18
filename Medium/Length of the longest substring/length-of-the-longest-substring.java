//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String s = read.readLine().trim();

            Solution ob = new Solution();
            System.out.println(ob.longestUniqueSubsttr(s));
        }
    }
}
// } Driver Code Ends


//User function Template for Java


class Solution{
    int longestUniqueSubsttr(String S){
        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int right=0;
        int max = 0;
        while(right < S.length())
        {
            if(!set.contains(S.charAt(right)))
            {
                set.add(S.charAt(right));
                right++;
            }
            else
            {
                set.remove(S.charAt(left));
                left++;
            }
            max = Math.max(max,set.size());
        }
        return max;   
    }
}