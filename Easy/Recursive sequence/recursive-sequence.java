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
            int N = Integer.parseInt(in.readLine());
            
            Solution ob = new Solution();
            System.out.println(ob.sequence(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static  int d=1000000007;
    static long cal(int i, int lastdigit){
     long ans=1;
     for(int j=lastdigit;j>=(lastdigit-i+1);j--){
         ans=ans*j;
         ans=ans%d;
     }
     return ans;
    }
    static long sequence(int n){
        // code here
      long fans=0;
      for(int i=1; i<=n; i++){
          int lasdigit = ((i*(i+1))/2);
          fans += cal(i,lasdigit);
      }
      return fans%d;
    }
}