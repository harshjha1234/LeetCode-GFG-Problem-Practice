//{ Driver Code Starts
import java.util.*;

import java.io.*;
class XOR
{	
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-- > 0)
		{
		  int n = Integer.parseInt(br.readLine().trim());
		  String s[] = br.readLine().trim().split(" ");
		  int[] a = new int[n];
			for(int i=0;i<n;i++)
				a[i]=Integer.parseInt(s[i]);
		  Solution g = new Solution();
		  System.out.println(g.maxSubsetXOR(a , n));
		}
	}
}
// } Driver Code Ends


/*Complete the function below*/

class Solution
{
    public static int maxSubsetXOR(int arr[], int N)
    {
        //add code here.
        int res=0;
        Arrays.sort(arr);
        while(true)
        {
            int max=arr[N-1];
            for(int i=0;i<N;i++)
            {
                    if(max<arr[i])
                    {
                        max=arr[i];
                    }
            }
            if(max==0)
            {
                return res;
            }
            res=Math.max(res,res^max);
            for(int i=0;i<N;i++)
            {
                    arr[i]=Math.min(arr[i],arr[i]^max);
            }
        }
    }
}