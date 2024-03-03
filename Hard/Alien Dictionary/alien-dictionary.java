//{ Driver Code Starts
/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
import java.math.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = Integer.parseInt(sc.next());
		while(t-- > 0)
		{
		    int n = Integer.parseInt(sc.next());
		    int k = Integer.parseInt(sc.next());
		    
		    String[] words = new String[n];
		    
		    for(int i=0;i<n;i++)
		    {
		        words[i] = sc.next();
		    }
		    
		    Solution ob = new Solution();
		  //  System.out.println(T.findOrder(words,k));
		    String order = ob.findOrder(words,n,k);
		    if(order.length() == 0){
		        System.out.println(0);
		        continue;
		    }
		    if(order.length() != k){
		        System.out.println("INCOMPLETE");
		        return;
		    }
		    String temp[] = new String[n];
		    for(int i=0;i<n;i++)
		        temp[i] = words[i];
		    
		    Arrays.sort(temp, new Comparator<String>(){
		    
		      @Override
                public int compare(String a, String b) {
                    int index1 = 0;
                    int index2 = 0;
                    for(int i = 0; i < Math.min(a.length(), b.length()) 
                                        && index1 == index2; i++) {
                        index1 = order.indexOf(a.charAt(i));
                        index2 = order.indexOf(b.charAt(i));
                    }
                
                    if(index1 == index2 && a.length() != b.length()) 
                    {
                        if(a.length() < b.length())
                            return -1;
                        else
                            return 1;
                    }
                
                    if(index1 < index2)
                        return -1;
                    else
                        return 1;
                        
                }
		    });
		    
		    int flag = 1;
		    for(int i=0;i<n;i++)
		    {
		        if(!words[i].equals(temp[i]))
	            {
	                flag = 0;
	                break;
	            }
		    }
		    
		    System.out.println(flag);
		}
	}
	
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public String findOrder(String [] dict, int N, int K)
    {
        // Write your code here
        int[] to = new int[K];

        String prev = dict[0];
        for (int i=1; i<N; i++) {
            int l = Math.min(dict[i-1].length(), dict[i].length());
            for (int j=0; j<l; j++) {
                char chFrom = dict[i-1].charAt(j);
                char chTo = dict[i].charAt(j);
                if(chFrom != chTo) {
                    to[chTo - 'a'] |= mask(chFrom) ;
                    break;
                }
            }
        }

        int todoMask = 0xFFFFFFFF; 
        StringBuilder sb = new StringBuilder();
        boolean allDone = false;
        while (!allDone) {
            allDone = true;
            for (int i=0; i<K; i++) {
                int charMask =  mask((char)('a'+i));
                if ((todoMask&charMask) != 0) {
                    if((to[i]&todoMask)==0) { 
                        sb.append((char)('a'+i));
                        todoMask &= ~charMask;
                    } else {
                        allDone = false;
                    }               
                }
            }
        }
        return sb.toString();
    }
    
    public int mask(char ch) {
        int k = ch - 'a';
        return 0x01 << k;
        
    }
}