//{ Driver Code Starts
import java.util.*;

class WildcardPattern
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t>0)
		{
			String pat = sc.nextLine();
			String text = sc.nextLine();
			Solution g = new Solution();
			System.out.println(g.wildCard(pat,text));
			t--;
		}
	}
}
// } Driver Code Ends


class Solution
{
    static int solve(String pattern, String str, int i, int j, int dp[][])
    {
        if(i < 0 && j < 0){ 
            return 1;
        }else if(i < 0 && j >= 0){ 
            return 0;
        }else if(i >= 0 && j < 0){
            for(int ii=i; ii>=0; ii--){
                if(pattern.charAt(ii) != '*'){ 
                    return 0;
                }
            }
            return 1;
        }
        
        if(dp[i][j] != -1){ 
            return dp[i][j];
        }
        
        char ch1 = pattern.charAt(i);
        char ch2 = str.charAt(j);
        
        if(ch1 == ch2 || ch1 == '?'){ 
            return dp[i][j] = solve(pattern, str, i-1, j-1, dp);
        }else if(ch1 == '*'){
            return dp[i][j] = solve(pattern, str, i-1, j, dp) | solve(pattern, str, i, j-1, dp);
        }else{ 
            return dp[i][j] = 0;
        }
        
    }
    int wildCard(String pattern, String str)
    {
        // Your code goes here
        int n = pattern.length();
        int m = str.length();
        int dp[][] = new int[n][m];
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++) dp[i][j] = -1;
        }
        return solve(pattern, str, n-1, m-1, dp);
    }
}
