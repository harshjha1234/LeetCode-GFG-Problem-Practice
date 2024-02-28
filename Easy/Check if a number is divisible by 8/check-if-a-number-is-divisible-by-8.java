//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S=read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.DivisibleByEight(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    int DivisibleByEight(String s){
        //code here
        int n=s.length();
        String p="";
        if(s.length()<=3){
            int a=Integer.parseInt(s);
            if(a%8==0)return 1;
            return -1;
        }
        p=p+s.charAt(n-3)+s.charAt(n-2)+s.charAt(n-1);
        int b=Integer.parseInt(p);
        if(b%8==0)return 1;
        return -1;
    }
}