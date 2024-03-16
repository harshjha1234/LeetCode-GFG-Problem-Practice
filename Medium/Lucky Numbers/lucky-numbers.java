//{ Driver Code Starts
//Initial Template for Java


import java.util.*;
import java.io.*;
import java.lang.*;

class Driver
{
    public static void main(String args[])throws IOException
    {
        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());//testcases
        
        while(t-- > 0)
        {
            int n = Integer.parseInt(reader.readLine());//input n
            //printing "1" if isLucky() returns true else "0"
            Solution s = new Solution();
            System.out.println(s.isLucky(n)? "1" : "0");
        }
    }
}
// } Driver Code Ends


//User function Template for Java



class Solution
{
    // Complete the function
    // n: Input n
    // Return True if the given number is a lucky number else return False
    static boolean check(int n , int c){
        if(n<c){
            return true;
        }
        
        if(n%c==0){
            return false;
        }
        
         n=n-(n/c);
        return check(n, c+1);
    }
    public static boolean isLucky(int n)
    {
        // Your code here
        return check(n , 2);
    }
}