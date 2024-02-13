//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            String S = br.readLine().trim();
            Solution obj = new Solution();
            List<String> ans = obj.find_permutation(S);
            for( int i = 0; i < ans.size(); i++)
            {
                out.print(ans.get(i)+" ");
            }
            out.println();
                        
        }
        out.close();
	}
}


// } Driver Code Ends


class Solution {
    HashSet<String> set = new HashSet<>();
    public void helper(String str, List<String> ans, String psf){
        if (str.isEmpty()){
            if (!set.contains(psf)){
                set.add(psf);
                ans.add(psf);
            }
            return;
        }

        for (int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            String first = str.substring(0, i);
            String second = str.substring(i+1);
            helper(first + second, ans, psf + ch);
        }
    }
    public List<String> find_permutation(String S) {
        // Code here
        List<String> ans = new ArrayList<>();
        helper(S, ans, "");
        Collections.sort(ans);
        return ans;
    }
}