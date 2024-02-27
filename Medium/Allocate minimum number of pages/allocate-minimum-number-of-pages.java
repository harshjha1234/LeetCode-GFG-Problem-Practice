//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int a[]=new int[n];
		    
		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		    }
		    int m=sc.nextInt();
		    Solution ob = new Solution();
		    System.out.println(ob.findPages(a,n,m));
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution 
{
    public static int numberOfStudent(int pages[],int n,int capacity){
        int student_count = 1;
        int curr_capacity = pages[0];
        
        for(int i=1;i<n;i++){
            curr_capacity+=pages[i];
            if(curr_capacity>capacity){
                student_count+=1;
                
                curr_capacity = pages[i];
                
            }
        }
        return student_count;
    }
    //Function to find minimum number of pages.
    public static int findPages(int[]A,int N,int M)
    {
        //Your code here
         int start = Arrays.stream(A).max().orElseThrow();
        int end = Arrays.stream(A).sum();
        if(N<M){
            return -1;
        }
        if(numberOfStudent(A,N,start)<=M){
            return start;
        }

        while(start<end){
            if(start==end-1){
                break;
            }

            int mid = start + (end-start)/2;
            int curr_student = numberOfStudent(A,N,mid);
            if(curr_student<=M){
                end = mid;
            }
            else{
                start = mid;
            }
        }
        return start+1;
    }
};