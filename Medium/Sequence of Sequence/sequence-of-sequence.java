//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String input_line[] = read.readLine().trim().split("\\s+");
            int m = Integer.parseInt(input_line[0]);
            int n = Integer.parseInt(input_line[1]);
            
            Solution ob = new Solution();
            System.out.println(ob.numberSequence(m, n));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    static int solve(int i, int j, int m, int n){
        
        if( i > m) {
            return 0;
        }
        if( j == n ){ 
            return 1;
        }
        int ans = 0;
        for(int k = 2*i; k<=m; k++){
            ans += solve(k, j+1, m, n);
        }
        return ans;
    }
    
    static int numberSequence(int m, int n){
        
        int ans = 0;
        for(int i = 1;i<=m;i++){
            ans += solve(i, 1, m, n);
        }
        return ans;
    }
}