//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.lang.*;


class Array {

	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		  
		    //size of array
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    
		    //adding elements to the array
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    
		    Solution obj = new Solution();
		    
		    //calling trappingWater() function
		    System.out.println(obj.trappingWater(arr, n));
		}
	}
}


// } Driver Code Ends


class Solution{
    
    // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
    static long trappingWater(int arr[], int n) { 
        // Your code here
        int mx = Integer.MIN_VALUE;
        long water = 0;
        long unit =0;
        int index=0;
        for(int i = 0; i<n; i++){
            mx = Math.max(mx, arr[i]);
            if(mx>arr[i]){
                water = water+(mx-arr[i]);
            }
            else{
                index = i;
                unit+=water;
                water = 0;
            }
        }
        water = 0;
        mx = Integer.MIN_VALUE;
        for(int i= n-1; i>=index; i--){
            mx = Math.max(mx, arr[i]);
            if(mx>arr[i]){
                water = water+(mx-arr[i]);
            }
            else{
                unit+=water;
                water = 0;
            }
        }
        return unit;
    } 
}


