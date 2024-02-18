//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            System.out.println(new Solution().maxIndexDiff(arr, n));
        }
    }
}
// } Driver Code Ends


class Solution {

    int maxIndexDiff(int arr[], int n) {
        // code here
        int[] prefixMin = new int[n];
        prefixMin[0] = arr[0];

        for(int i = 1; i < n; i++){
            prefixMin[i] = Math.min(prefixMin[i-1], arr[i]);
        }


        int r=n-1,l=n-1,maxDist = Integer.MIN_VALUE;

        while(r >= 0 && l >= 0){
            if(arr[r] >= prefixMin[l]){
                maxDist = Math.max(maxDist, (r-l));
                l--;
            }else{
                r--;
            }

        }
        return maxDist;
    }
}