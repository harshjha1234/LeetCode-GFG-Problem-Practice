//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner ob=new Scanner(System.in);
		int t=ob.nextInt();
		while(t-->0)
		{
		    long n=ob.nextLong();
		    Solution ab=new Solution();
		    long k=ab.findNth(n);
		    System.out.println(k);
		}
	}
}

    

// } Driver Code Ends


//User function Template for Java

class Solution {
    long findNth(long N)
    {
        //code here
        String ans = "";
        while(N > 0){
            ans = Long.toString(N % 9) + ans;
            N = N / 9;
        }
        long a = Long.parseLong(ans);
        return a;
    }
}