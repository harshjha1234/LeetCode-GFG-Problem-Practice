//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            String str=br.readLine();
    		String[] starr=str.split(" ");
    		
    		//input n and d
    	    int n=Integer.parseInt(starr[0]);
    		int k= Integer.parseInt(starr[1]);
            
            starr = br.readLine().trim().split(" ");
            int[] price = new int[n];
            for(int i = 0; i < n; i++)
                price[i] = Integer.parseInt(starr[i]);
            
            Solution obj = new Solution();
            int res = obj.buyMaximumProducts(n, k, price);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends




class Solution {
    static class Pair{
        int val;
        int ind;
        
        Pair(int val,int ind){
            this.val=val;
            this.ind=ind;
        }
    }
    public static int buyMaximumProducts(int n, int k, int[] price) {
        // code here
        PriorityQueue<Pair>pq=new PriorityQueue<>((a,b)->a.val-b.val);
        
        for(int i =0; i<n;i++){
            pq.add(new Pair(price[i],i+1));
        }
        int amount=0,ans=0;
        boolean check=false;
        while(pq.size()>0){
            Pair p=pq.poll();
            
            for(int i=p.ind;i>=1;i--){
                amount+=(p.val*i);
                
                if(amount<=k){
                    ans+=i;
                    break;
                }else{
                    check=true;
                    amount-=(p.val*i);
                }
            }
            if(check==true){
                break;
            }
        }
        
        return ans;
    }
}
        
