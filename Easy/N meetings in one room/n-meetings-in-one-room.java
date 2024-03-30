//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            String inputLine[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);

            int start[] = new int[n];
            int end[] = new int[n];

            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++)
                start[i] = Integer.parseInt(inputLine[i]);

            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) 
                end[i] = Integer.parseInt(inputLine[i]);
                
            int ans = new Solution().maxMeetings(start, end, n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


class Solution 
{
    static class Pair implements Comparable<Pair>{
        int st;
        int end;
        public Pair(int st, int end){
            this.st = st;
            this.end = end;
        }
        public int compareTo(Pair X){  
            return this.end- X.end;
        }
    }
    public static int maxMeetings(int start[], int end[], int n)
    {
        Pair[] p = new Pair[n]; 
        for(int i=0; i<n; i++){
            p[i] = new Pair(start[i], end[i]);
        }
        Arrays.sort(p); 
        int count=1;
        Pair curr = p[0];
        
        for(int i=1; i<n; i++){
            if(curr.end<p[i].st){ 
                count++;
                curr = p[i];
            }
        }
        return count;
    }
}
