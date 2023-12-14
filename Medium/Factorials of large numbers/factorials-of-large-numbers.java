//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GfG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int N = sc.nextInt();
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.factorial(N);
            for (Integer val: ans) 
                System.out.print(val); 
            System.out.println();
        }   
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static ArrayList<Integer> factorial(int N){
        //code here
        ArrayList<Integer> s = new ArrayList<>();
        s.add(1);
        for(int i=1; i<=N; i++){
            int l = s.size();
            int c = 0;
            for(int j=0; j<l; j++){
                int t = s.get(j)*i+c;
                s.set(j, t%10);
                c = t / 10;
            }
            while(c > 0){
                s.add(c%10);
                c = c / 10;
            }
        }
        Collections.reverse(s);
        return s;
    }
}