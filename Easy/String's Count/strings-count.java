//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
  
        
        int t = Integer.parseInt(br.readLine().trim()); 

        while(t > 0){
        	long n = Integer.parseInt(br.readLine().trim()); 
            Solution ob = new Solution();
            System.out.println(ob.countStr(n)); 
            t--;
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    static long countStr(long n)
	{
	    long count = 0;
	    //if all a=n, b=0, c=0
	    count += 1;
	    //if b = 1, a = n-1, c=0
	    count += n;
	    //if c=1, b=0, a = n-1
	    count += n;
	    // if b=1, c=1, a=n-2
	    count += n*(n-1);
	    // if b=0, c=2, a= rest all
	    count += n*(n-1)/2;
	    // if b=1, c=2 and a=rest all
	    count += n*(n-1)*(n-2)/2;
	    return count;
	}
} 