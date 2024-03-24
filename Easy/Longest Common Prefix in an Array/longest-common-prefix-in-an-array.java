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
            int n = Integer.parseInt(read.readLine().trim());
            String arr[] = read.readLine().trim().split(" ");

            Solution ob = new Solution();
            System.out.println(ob.longestCommonPrefix(arr, n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    String longestCommonPrefix(String arr[], int n){
        // code here
        String dummy= arr[0];
        for(int i=0;i<n;i++)
        {
            while(arr[i].indexOf(dummy)!=0)
            {
                dummy=dummy.substring(0,dummy.length()-1);
            }
            if(dummy.isEmpty())
            {
                return "-1";
            }
        }
        return dummy;
    }
}