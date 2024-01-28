//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String S = in.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.maxLength(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int maxLength(String S){
        // code here
         int left=0;
        int right=0;
        int max=0;
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)=='('){
                left++;
            }
            else{
                right++;
            }
            if(left==right){
                max=Math.max(max,left*2);
            }
            else if(right>left){
                left=0;
                right=0;
            }
        }
        left=0;
        right=0;
        for(int i=S.length()-1;i>=0;i--){
             if(S.charAt(i)=='('){
                left++;
            }
            else{
                right++;
            }
            if(left==right){
                max=Math.max(max,left*2);
            }
            else if(left>right){
                left=0;
                right=0;
            }
        }
        return max;
    }
}