//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String S = sc.next();
                    int R = sc.nextInt();
                    int N = sc.nextInt();
                    Solution obj = new Solution();
                    System.out.println(obj.nthCharacter(S,R,N));
                }
                
        }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public char nthCharacter(String s, int r, int n)
    {
        //code here
        if(r==0) return s.charAt(n);
        
        for(int i=0;i<r;i++)
        {
            String temp="";
            for(int k=0;k<=n;k++)  // run loop only till n because 0<=n<|s|
            {
               if(s.charAt(k)=='0') temp=temp+"01";
               else temp=temp+"10";
            }
            s=temp;
        }
        return s.charAt(n);
    }
}