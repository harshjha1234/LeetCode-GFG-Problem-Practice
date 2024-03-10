//{ Driver Code Starts
import java.util.*;
class GFG
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t>0)
		{
			String str = sc.nextLine();
			//System.out.println(str.length());
			Solution ob  = new Solution();
			System.out.println(ob.countPS(str));
		t--;
		}
	}
}
// } Driver Code Ends


/*You are required to complete below method */

class Solution
{
    int MOD = 1000000007;
    long countPS(String str)
    {
        // Your code here
        int N = str.length();
        long[][] dp = new long[N][N];

        for (int i = 0; i < N; i++) {
            dp[i][i] = 1;
        }

        for (int length = 2; length <= N; length++) {
            for (int i = 0; i < N - length + 1; i++) {
                int j = i + length - 1;
                if (str.charAt(i) == str.charAt(j)) {
                    dp[i][j] = (dp[i + 1][j] + dp[i][j - 1] + 1) % MOD;
                } else {
                    dp[i][j] = (dp[i + 1][j] + dp[i][j - 1] - dp[i + 1][j - 1] + MOD) % MOD;
                }
            }
        }

        return (int) dp[0][N - 1];
    }
}