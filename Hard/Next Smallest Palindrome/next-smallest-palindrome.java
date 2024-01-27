//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            int num[] = new int[n];
            String[] str = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                num[i] = Integer.parseInt(str[i]);
            }

            Vector<Integer> ans = new Solution().generateNextPalindrome(num, n);
            for (Integer x : ans) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {

    Vector<Integer> generateNextPalindrome(int num[], int n) {
        // code here
        boolean change = true; 
        for (int i = 0; i < n / 2; i++) {
            if (num[i] > num[n - i - 1]) {
                change = false; 
            } else if (num[i] < num[n - i - 1]) {
                change = true;
            }
            num[n - i - 1] = num[i];
        }

        Vector<Integer> ans = new Vector<>();
        for (int i = 0; i < n; i++) {
            ans.add(num[i]);
        }
        int index = n / 2;
        boolean carry = change;
        while (carry && index < n) {
            if (ans.get(index) == 9) {
                ans.set(index, 0);
                ans.set(n - index - 1, ans.get(index));
            } else {
                int incremented = ans.get(index) + 1;
                ans.set(index, incremented);
                ans.set(n - index - 1, incremented);
                carry = false;
            }
            index++;
        }
        if (carry) {
            ans.set(0, 1);
            ans.add(1);
        }
        return ans;
    }
}