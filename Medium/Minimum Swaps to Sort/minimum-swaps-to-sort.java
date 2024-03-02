//{ Driver Code Starts
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
            int n = Integer.parseInt(br.readLine().trim());
            int[] nums = new int[n];
            String[] S = br.readLine().trim().split(" ");
            for(int i = 0; i < n; i++){
                nums[i] = Integer.parseInt(S[i]);
            }
            Solution obj = new Solution();
            int ans = obj.minSwaps(nums);
            System.out.println(ans);
       }
    }
}
// } Driver Code Ends




class Solution
{
    //Function to find the minimum number of swaps required to sort the array.
    public int minSwaps(int nums[])
    {
        // Code here
        int[] temp=Arrays.copyOf(nums,nums.length);
        Arrays.sort(temp);
        
        HashMap<Integer,Integer> hash=new HashMap<>();
        
        for(int i=0; i<nums.length; i++){
            hash.put(temp[i],i);
        }
        int ans=0;
        int left=0;
        while(left<nums.length){
            
            if(left==hash.get(nums[left])){
                left++;
            }
            else{
                int tem=nums[hash.get(nums[left])];
                nums[hash.get(nums[left])]=nums[left];
                nums[left]=tem;
                ans++;
                
            }
        }
        return ans;
    }
}