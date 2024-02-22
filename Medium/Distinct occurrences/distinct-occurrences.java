//{ Driver Code Starts
import java.util.*;

class Distinct_Occurrences
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t>0)
		{
			String line = sc.nextLine();
			String S = line.split(" ")[0];
			String T = line.split(" ")[1];
			
			Solution ob = new Solution();
			System.out.println(ob.subsequenceCount(S,T));
			t--;
		}
	}
}
// } Driver Code Ends


/*You are required to complete this method*/

class Solution
{
    int  subsequenceCount(String s, String t)
    {
	// Your code here
    	int []dp = new int[t.length() + 1];
        for(int j = 0 ; j < dp.length ; j++)
            dp[j] = 0;
        dp[0] = 1;
            
        int mod = (int)Math.pow(10, 9) + 7;
        
        for(int i = 0 ; i < s.length()  ; i++){
             int []curr = new int[t.length() + 1];
             curr[0] = 1;
            for(int j = 0 ; j < t.length()  ; j++){
                if(s.charAt(i) == t.charAt(j))
                    curr[j + 1] = (int)(((long)dp[j + 1] + dp[j]) % mod);
                else
                    curr[j + 1] = dp[j + 1];
                
            }
            dp = curr;
            
        }
        return dp[dp.length - 1];
    }
}