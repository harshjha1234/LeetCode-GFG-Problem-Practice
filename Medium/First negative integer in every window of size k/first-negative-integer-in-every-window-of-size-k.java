//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            long a[] = new long[(int)(n)];
            // long getAnswer[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            int k = Integer.parseInt(br.readLine().trim());
            
            Compute obj = new Compute();
            long answer[] = obj.printFirstNegativeInteger(a, n, k);
            int sz = answer.length;
            
            StringBuilder output = new StringBuilder();
            for(int i=0;i<sz;i++)
                output.append(answer[i]+" ");
            System.out.println(output);
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java


class Compute {
    
    public long[] printFirstNegativeInteger(long A[], int N, int K)
    {
     long[] negEle=new long[N];
     int start=0;
     int end=0;
     long[] ans=new long[N-K+1];
     int in=0;
     
     Queue<Long> q = new LinkedList<>();
     
     while(end<N){
         if(A[end]<0){
             q.add(A[end]);
         }
         if(end-start+1<K){
             end++;
         }
         else if(end-start+1==K){
             if(!q.isEmpty()){
                ans[in++]=q.peek();
             }else{
                ans[in++]=0;
             }
             if (!q.isEmpty() && A[start] == q.peek()) {
                q.remove();
            }

             start++;
             end++;
         }
     }
     return ans;   
    }
}