//{ Driver Code Starts
import java.util.*;

class Partition_Arr_To_K_Subsets
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			int a[] = new int[n];
			for(int i=0;i<n;i++)
				a[i] = sc.nextInt();
			int k = sc.nextInt();
			Solution g = new Solution();
			if(g.isKPartitionPossible(a,n,k)==true)
				System.out.println(1);
			else 
				System.out.println(0);
			
		t--;
		}
	}
}
// } Driver Code Ends


/*You are required to complete this method */

class Solution
{
    public boolean isKPartitionPossible(int a[], int n, int k)
    {
	    // Your code here
        int sm=0;
        for(int i : a){
          sm += i;
        }
        if(sm%k!=0)
            return false;
        sm/=k;
        Arrays.sort(a);
        return helper(a,a.length-1,k,0,sm,new boolean[a.length]);
    }
    public boolean helper(int a[],int n,int k,int csm,int sum,boolean vis[]){
        if(k==0)
            return true;
        if(csm==sum)
            return helper(a,a.length-1,k-1,0,sum,vis);
        for(int i=n;i>=0;i--){
            if(vis[i])
                continue;
            if(i+1<a.length && a[i]==a[i+1] && !vis[i+1])
                continue;
            if(csm+a[i]>sum)
                continue;
            vis[i]=true;
            if(helper(a,i-1,k,csm+a[i],sum,vis))
                return true;
            vis[i]=false;
        }
        return false;
    }
}
