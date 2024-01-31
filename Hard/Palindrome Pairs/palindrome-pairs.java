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
            int N = Integer.parseInt(read.readLine());
            
            String arr[] = new String[N];
            
            for(int i=0; i<N; i++)
                arr[i] = read.readLine();

            Solution ob = new Solution();
            
            if(ob.palindromepair(N,arr))System.out.println("1");
            else System.out.println("0");
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static boolean palindromepair(int N, String arr[]) {
        // code here
        for(int i=0;i<N-1;i++){
            for(int j=i+1;j<N;j++){
                if(arr[i].charAt(0)==arr[j].charAt(arr[j].length()-1) || arr[j].charAt(0)==arr[i].charAt(arr[i].length()-1))   
                    if(helper(arr[i]+arr[j]) || helper(arr[j]+arr[i]))
                        return true;
            }
        }
        return false;
    }
      
    static boolean helper(String s){
      int i=0;
      int j=s.length()-1;
      while(i<=j)
      {
          if(s.charAt(i)!=s.charAt(j))
               return false;
               
               i++;
               j--;
      }
      
      return true;
    }
};