//{ Driver Code Starts
import java.util.*;

class Sorted_Array {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            Solution obj = new Solution();
            System.out.println(obj.transitionPoint(arr, n));
            T--;
        }
    }
}
// } Driver Code Ends


class Solution {
    int transitionPoint(int arr[], int n) {
        // code here
        int count=0;
        for(int i=0; i<n; i++){
            if(arr[i]==0){
                count++;
            }
            else if(arr[i]==1){
                return count;
            }
        }
        return -1;
    }
}