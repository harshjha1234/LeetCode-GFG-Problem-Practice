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
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String A = br.readLine().trim();
            Solution ob = new Solution();
            String ans = ob.FirstNonRepeating(A);
            out.println(ans);
        }
        out.close();
    }
}

// } Driver Code Ends


class Solution
{
    public String FirstNonRepeating(String A)
    {
        // code here
        StringBuilder result = new StringBuilder();
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < A.length(); i++) {
            char currentChar = A.charAt(i);
            map.put(currentChar, map.getOrDefault(currentChar, 0) + 1);
            result.append(getFirstNonRepeating(map));
        }
        return result.toString();
    }

    private char getFirstNonRepeating(LinkedHashMap<Character, Integer> map) {
        for (char key : map.keySet()) {
            if (map.get(key) == 1) {
                return key;
            }
        }
        return '#';
    }
}