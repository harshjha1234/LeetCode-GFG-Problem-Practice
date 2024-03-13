//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		while(t-->0)
		{
		    int n;
		    n=sc.nextInt();
		    
		    long arr[]=new long[n];
	
		    
		    for(int i=0;i<n;i++)
		    {
		        arr[i]=sc.nextLong();
		    }
            Solution ob = new Solution();
		    System.out.println(ob.findSubarray(arr,n));
		}
		
	}
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    //Function to count subarrays with sum equal to 0.
    public static long findSubarray(long[] arr ,int n) 
    {
        //Your code here
        long count = 0;
        HashMap<Integer, Integer> presum = new HashMap<>();
        int currsum = 0;
        for(int i =0; i<n; i++){
            currsum += arr[i];
            if(currsum == 0){
                count += 1;
            }
            if(presum.containsKey(currsum)){
                count += presum.get(currsum);
                presum.put(currsum, presum.get(currsum) + 1);
            }
            else{
                presum.put(currsum, 1);
            }
        }
        return count;
    }
}