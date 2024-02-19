//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
public class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n;
                    n = sc.nextInt();
                    ArrayList<String> arr = new ArrayList<String>();
                    for(int i = 0;i<n;i++)
                        {
                            String p = sc.next();
                            arr.add(p);
                        }
                    String line = sc.next();
                    Solution obj = new Solution();  
                    System.out.println(obj.wordBreak(line,arr));  
                    
                }
        }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public static int wordBreak(String A, ArrayList<String> B )
    {
        //code here
        int strLen=A.length(), arrLen=B.size();
        boolean[] dp=new boolean[strLen+1];
        dp[strLen]=true;
        for(int i=strLen-1; i>=0; i--) {
            for(int j=0; j<arrLen; j++) {
                if(i+B.get(j).length()<=strLen && A.substring(i, i+B.get(j).length()).equals(B.get(j))) {
                    dp[i]=dp[i+B.get(j).length()];
                }
                if(dp[i]) break;
            }
        }
        if(dp[0]) return 1;
        else return 0;
    }
}