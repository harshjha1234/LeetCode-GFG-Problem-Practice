//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    int n = Integer.parseInt(br.readLine().trim());// input size of array
		    int arr[] = new int[n];
		    String inputLine2[] = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine2[i]); // input elements of array
		    }
		    
		    Solution obj = new Solution();
		    
		    System.out.println(obj.circularSubarraySum(arr, n));// print the circularSubarraySum
		}
	}
}



// } Driver Code Ends


class Solution{

    // a: input array
    // n: size of array
    //Function to find maximum circular subarray sum.
    static int circularSubarraySum(int a[], int n) {
        
        // Your code here
        if(n==0) return 0;
        int x = kadanes(a,n);
        int y = 0;
        for(int i=0; i<n; i++) {
            y += a[i];
            a[i] *= -1;
        }
        int z = kadanes(a,n);
        if(y+z==0) return x;
        return Math.max(x, y+z);
    }
    
    static int kadanes(int a[], int n) {
        int temp = a[0], sum = a[0];
        for(int i=1; i<n; i++){
            temp += a[i];
            if(temp < a[i]){
                temp = a[i];
            }
            sum = Math.max(sum, temp);
        }
        return sum;
    }
    
}

