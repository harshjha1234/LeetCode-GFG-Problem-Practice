//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S[] = read.readLine().split(" ");
            int R = Integer.parseInt(S[0]);
            int C = Integer.parseInt(S[1]);
            int matrix[][] = new int[R][C];
            int c = 0;
            for(int i = 0; i < R; i++){
                String line[]=read.readLine().trim().split(" ");
                for(int j = 0; j < C; j++){
                    matrix[i][j] = Integer.parseInt(line[j]);
                }
            }
            Solution ob = new Solution();
            int ans = ob.median(matrix, R, C);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    int median(int matrix[][], int R, int C) {
        // code here    
        int s = 1, e = 2000;
        
        while(s<=e) {
            int m = (s+e) >> 1;
            
            int countL = 0, countR = 0;
            
            for(int[] mat: matrix) {
                for(int num: mat) {
                    if(num > m)
                        countR++;
                    else
                        countL++;
                }
            }
            
            if(countL == countR)
                return m;
            else if(countL < countR) 
                s = m+1;
            else
                e = m-1;
        }
        return s;
    }
}