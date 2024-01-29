//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int n = sc.nextInt();
            long array[] = new long[n];
            for (int i = 0; i < n; ++i)
            {
                array[i] = sc.nextLong();
            }
            Solution ob = new Solution();
            System.out.println(ob.smallestpositive(array,n));
            t--;
        }
    } 
} 

// } Driver Code Ends


//User function Template for Java

class Solution { 
    long smallestpositive(long[] array, int n){ 
        // Your code goes here 
        long ans=1;
        Arrays.sort(array);
        for(int i=0;i<n;i++){
            if(array[i]>ans)return ans;
            ans+=array[i];
        }
        return ans;
    }
} 