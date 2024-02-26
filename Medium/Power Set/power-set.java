//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String s = br.readLine().trim();
            Solution ob = new Solution();
            List<String> ans = ob.AllPossibleStrings(s);
            for(String i: ans)
                System.out.print(i + " ");
            System.out.println();
            
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public List<String> AllPossibleStrings(String s)
    {
        // Code here
        List<String> ans=new ArrayList<>();
        trav(s.toCharArray(),0,s.length(),"",ans);
        Collections.sort(ans);
        return ans;
    }
public static void trav(char a[],int i,int n,String s,List<String> l){
    if(i==n){
        if(s.length()>0)l.add(s);
        return;
    }
    trav(a,i+1,n,s+a[i],l);
    trav(a,i+1,n,s,l);
    }
}