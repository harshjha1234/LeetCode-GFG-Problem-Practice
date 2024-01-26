//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Main {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int T=sc.nextInt();
		sc.nextLine();
		while(T-->0)
		{
		    
		    Solution ob=new Solution();
		    
		    String S=sc.nextLine();
		    
		    ArrayList<String> arr = ob.permutation(S);
		    for(String s : arr){
		        System.out.print(s+" ");
		    }
		    System.out.println();
		}
		
	}
}

// } Driver Code Ends


//User function Template for Java


class Solution
{
    public void permute(ArrayList<String>ans,String s,String temp,int index,boolean vis[])
    {
        if(temp.length()==s.length()){
            ans.add(temp);
            return;
        }
        if(index==s.length()){
            return;
        }
        if(!vis[index]){
            vis[index]=true;
            permute(ans,s,temp+s.charAt(index),0,vis);
            vis[index]=false;
        }
        permute(ans,s,temp,index+1,vis);
    }
    public ArrayList<String> permutation(String S)
    {
        //Your code here
        ArrayList<String>ans=new ArrayList<>();
        permute(ans,S,"",0,new boolean[S.length()]);
        Collections.sort(ans);
        return ans;
    }
	   
}
