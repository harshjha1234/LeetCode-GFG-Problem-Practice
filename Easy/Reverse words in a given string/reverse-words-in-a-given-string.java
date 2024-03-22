//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String s = sc.next();
            Solution obj = new Solution();
            System.out.println(obj.reverseWords(s));
            t--;
        }
    }
}

// } Driver Code Ends



class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String S)
    {
        // code here
        String w = "";
        String rev="";
        for(int i=0;i<S.length();i++){
            char c = S.charAt(i);
            if(c!='.'){
                w+=c;
            }
            else{
                rev=w+"."+rev;
                w="";
            }
        }
        rev = w+"."+rev;
        rev = rev.substring(0, rev.length()-1);
        return rev;
    }
}