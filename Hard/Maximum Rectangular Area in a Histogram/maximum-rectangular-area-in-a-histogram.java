//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    long n = Long.parseLong(br.readLine().trim());
		    String inputLine[] = br.readLine().trim().split(" ");
		    long[] arr = new long[(int)n];
		    for(int i=0; i<n; i++)arr[i]=Long.parseLong(inputLine[i]);
		    System.out.println(new Solution().getMaxArea(arr, n));
		}
	}
}




// } Driver Code Ends


class Solution
{
    //Function to find largest rectangular area possible in a given histogram.
    public static long getMaxArea(long hist[], long n) 
    {
        // your code here
        long ns[]= nps(hist);
        long ps[]=pps(hist);
        long m=0l;
        for(int i=0;i<n;i++){
            long ans=(ns[i]-ps[i]-1) *hist[i];
            m=Math.max(ans,m);
        }
        return m;
    }
    static long[] nps(long arr[]){
        long [] ns = new long[arr.length];
        Stack<Integer> s=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]) s.pop();
            ns[i]=s.isEmpty()?arr.length:s.peek();
            s.push(i);
            
        }
        return ns;
    }
    static long[] pps(long arr[]){
        long ps[]= new long[arr.length];
        Stack<Integer> s= new Stack<>();
        for(int i=0;i<arr.length;i++){
        while(!s.isEmpty() && arr[s.peek()]>=arr[i]) s.pop();
            ps[i]=s.isEmpty()?-1:s.peek();
            s.push(i);
        }
        return ps;
    }
        
}



