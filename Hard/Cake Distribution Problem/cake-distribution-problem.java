//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class GFG{
	public static void main(String [] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		while(test-- > 0) {
			String [] str = br.readLine().trim().split(" ");
			int n = Integer.parseInt(str[0]);
			int k = Integer.parseInt(str[1]);
			int [] sweetness = new int[n];
			str = br.readLine().trim().split(" ");
			int i = 0;
			for(String s: str) {
				sweetness[i++] = Integer.parseInt(s);
			}
			Solution obj = new Solution();
			System.out.println(obj.maxSweetness(sweetness, n, k));
		}
	}
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    static boolean isp(int a[], int n, int k,int m){
        int sum=0;
        int p=0;
        for(int u:a) {
            sum+=u;
            if(sum>=m){
                p++;
                sum=0;
            } 
        }
        return p>=k+1;
    }
	int maxSweetness(int [] sweetness, int N, int K) {
	    int min=Integer.MAX_VALUE;
        int sum=0;
        for(int a:sweetness) {
            sum+=a;
            min=Math.min(a,min);
            
        }
        int ans=0;
        while(min<=sum){
            
            int mid= min+(sum-min)/2;
            if(isp(sweetness,N,K,mid) == true){
                ans=mid;
                min=mid+1;
            }else{ 
                sum=mid-1; 
            }
        }
        return ans;
	}
}