//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            char[] nuts = new char[n], bolts = new char[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                nuts[i] = (inputLine[i].charAt(0));
            }
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                bolts[i] = (inputLine[i].charAt(0));
            }

            new Solution().matchPairs(n, nuts, bolts);
            for (int i = 0; i < n; i++) {
                System.out.print(nuts[i] + " ");
            }
            System.out.println();
            for (int i = 0; i < n; i++) {
                System.out.print(bolts[i] + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    void matchPairs(int n, char nuts[], char bolts[]) {
        // code here
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('!', 1);
        map.put('#', 2);
        map.put('$', 3);
        map.put('%', 4);
        map.put('&', 5);
        map.put('*', 6);
        map.put('?', 7);
        map.put('@', 8);
        map.put('^', 9);

        
        Character[] nutsArr = new Character[n];
        Character[] boltsArr = new Character[n];
        for (int i = 0; i < n; i++) {
            nutsArr[i] = nuts[i];
            boltsArr[i] = bolts[i];
        }

        
        Arrays.sort(nutsArr, (a, b) -> map.get(a) - map.get(b));
        Arrays.sort(boltsArr, (a, b) -> map.get(a) - map.get(b));

        for (int i = 0; i < n; i++) {
            nuts[i] = nutsArr[i];
            bolts[i] = boltsArr[i];
        }
    }
}