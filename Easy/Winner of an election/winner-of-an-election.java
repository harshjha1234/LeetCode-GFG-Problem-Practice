//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            String arr[] = new String[n];
            
            for(int i = 0; i < n; i++)
                arr[i] = sc.next();
            
            Solution obj = new Solution();    
            String result[] = obj.winner(arr, n);
            System.out.println(result[0] + " " + result[1]);
            
           
        }
        
    }
}

// } Driver Code Ends




//User function Template for Java


class Solution
{
    //Function to return the name of candidate that received maximum votes.
    public static String[] winner(String arr[], int n)
    {
        // add your code
        String[] s= new String[2];
        TreeMap<String, Integer> m= new TreeMap<>();
        for(int i=0; i<n; i++){
            m.put(arr[i], m.getOrDefault(arr[i], 0)+1);
        }
        
        int maxi= Integer.MIN_VALUE;;
        String ans="";
        for(String i:m.keySet()){
            int t = m.get(i);
            if(t > maxi){
                ans = i;
                maxi=t;
            }
        }
        s[0]=ans;
        s[1]=""+maxi;
        return s;
        
    }
}

