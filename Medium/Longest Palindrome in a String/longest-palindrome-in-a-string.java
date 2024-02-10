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
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.longestPalin(S));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    static String longestPalin(String S){
        // code here
        int len = S.length();
        if(len==0 || len==1) return S;
        String ans = Character.toString(S.charAt(0));
        for(int i=0; i<len; i++){
            for(int j=len-1; j>i; j--){
                if((j-i)+1 <= ans.length()) break;
                if(S.charAt(i) == S.charAt(j)){
                    if(isPalindrome(S, i, j)){
                        if((j-i)+1 > ans.length()){
                            ans = S.substring(i, j+1);
                        }
                    }
                }
            }
        }
        return ans;
    }
    public static boolean isPalindrome(String str, int s, int e){
        while(s < e){
            if(str.charAt(s) != str.charAt(e)) return false;
            s++;
            e--;
        }
        return true;
    }
}