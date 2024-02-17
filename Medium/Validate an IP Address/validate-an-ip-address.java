//{ Driver Code Starts
// Initial Template for Java

// Initial Template for Java

import java.util.*;
import java.io.*;

  public class validip {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();
            Solution obj = new Solution();

            if (obj.isValid(s))
                System.out.println(1);
            else
                System.out.println(0);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {

    public boolean isValid(String s) {
        // Write your code here
        char ch1[]=s.toCharArray();
       int count=0;
       for(Character c1:ch1)
       {
           if(c1=='.')
           count++;
           
           if(count>3)
           return false;
       }
        String str[]=s.split("[.]");
        
        if(str.length!=4)
        return false;
        
        for(String st:str)
        {
            char ch[]=st.toCharArray();
           char cht='1';
            for(Character c:ch)
            {
                if(cht=='0')
                return false;
                
                cht=c;
                
            if(Character.isDigit(c))
            continue;
            else
            return false;
            }
            if(st.isEmpty())
            return false;
            int d=Integer.valueOf(st);
            if(d>=0 && d<=255)
            continue;
            else
            return false;
        }
        return true;
    }
}