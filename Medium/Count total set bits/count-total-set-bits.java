//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;


// } Driver Code Ends
//User function Template for Java

class Solution{
    
    //Function to return sum of count of set bits in the integers from 1 to n.
    public static int countSetBits(int n){
    
        // Your code here
        int y=0;
        if(n==0)
        return 0;
        for(int x=0;x<=n;x++){
            if((1<<x)>=n){   
                if((1<<x)==n){
                    y=x;
                    break;
                }
                y=x-1;
                break;
            }
        }
       int ans1=  (1<<(y-1))*(y);
       int ans2=((n-(1<<y))+1);
       int ans3=countSetBits((n-(1<<y)));
       return  (ans1+ans2+ans3);
        
    }
}

//{ Driver Code Starts.

// Driver code
class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();//testcases
		int x, n;
		while(t-->0) {
	        n = sc.nextInt();//input n

		    Solution obj = new Solution();

		    System.out.println(obj.countSetBits(n));//calling countSetBits() method
		}
	}
}

// } Driver Code Ends