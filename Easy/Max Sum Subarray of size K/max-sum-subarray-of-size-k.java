//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            
            int N=sc.nextInt();
            int K=sc.nextInt();
            ArrayList<Integer> Arr = new ArrayList<Integer>(N); 
  
            // Appending new elements at 
            // the end of the list 
            for (int i = 0; i < N; i++) {
                int x = sc.nextInt();
                Arr.add(x); 
            }

            Solution ob = new Solution();
            System.out.println(ob.maximumSumSubarray(K,Arr,N));
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{
    static long maximumSumSubarray(int K, ArrayList<Integer> Arr,int N){
        // code here.....this will give TLE after 1040 test cases pass
        // long msum = 0;
        // for(int i=0; i<N; i++){
        //     long sum = 0;
        //     int q = i+K;
        //     if(q <= N){
        //         for(int j=i; j<q; j++){
        //             sum += Arr.get(j);
        //         }
        //     }
        //     msum = Math.max(msum, sum);
        // }
        // return msum;
        long sum = 0, msum = 0;
        long[] psum = new long[N];
        psum[0] = Arr.get(0);
        for(int i=1; i<N; i++){
            psum[i] = psum[i-1]+Arr.get(i);
        }
        int t = 0;
        for(int i=K-1; i<N; i++){
            if(i == K-1){
                sum = psum[i];
            }else{
                sum = psum[i]-psum[t];
                t++;
            }
            msum = Math.max(msum, sum);
        }
        return msum;
    }
}