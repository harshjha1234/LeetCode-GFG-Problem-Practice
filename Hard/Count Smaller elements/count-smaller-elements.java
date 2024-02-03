//{ Driver Code Starts
//Initial Template for Java


import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int[] ans = new Solution().constructLowerArray(arr, n);
            for (int i = 0; i < n; i++) {
                System.out.print(ans[i] + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java


class Solution {
    int[] constructLowerArray(int[] arr, int n) {
        // code here
        int ans[]=new int[n];
        int x=n-2;
        List<Integer> res=new ArrayList<>();
        res.add(arr[n-1]);
        for(int i=n-2;i>=0;i--)
        {
            int idx=dfs(res,arr[i],0,res.size()-1);
            res.add(idx,arr[i]);
            ans[x]=idx;
            x--;
            
        }
        return ans;
        
    }
    int dfs(List<Integer>res, int key,int l,int h)
    {
        if(l<=h)
        {
            int mid=l+(h-l)/2;
            if(res.get(mid)>=key)
            {
                return dfs(res,key,l,mid-1);
            }
            else
            {
               return  dfs(res,key,mid+1,h);
            }
        }
        return l;
    }
}