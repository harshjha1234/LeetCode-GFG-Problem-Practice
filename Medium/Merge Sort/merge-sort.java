//{ Driver Code Starts
import java.util.*;

class Merge_Sort
{
    //method to print the elements of the array
	static void printArray(int arr[])
    {
        StringBuffer sb=new StringBuffer("");
        int n = arr.length;
        for (int i=0; i<n; ++i)
            sb.append(arr[i]+" ");
        System.out.println(sb.toString());
    }

    

	public static void main(String args[])
	{
	    //taking input using Scanner class
		Scanner sc = new Scanner(System.in);
		
		//taking testcases
		int T = sc.nextInt();
		while(T>0)
		{
		    //taking elements count
			int n = sc.nextInt();
			
			//creating an object of class Merge_Sort
			Merge_Sort ms = new Merge_Sort();
			
			//creating an array of size n
			int arr[] = new int[n];
			
			//adding elements to the array
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();

            
			Solution g = new Solution();
			
			//calling the method mergeSort
			g.mergeSort(arr,0,arr.length-1);

            //calling the method printArray
			ms.printArray(arr);
		T--;
		}
	}
}



// } Driver Code Ends


class Solution
{
    void merge(int arr[], int l, int m, int r)
    {
         // Your code here
        int an = m - l + 1;
        int bn = r - m;

        // Create two arrays
        int[] a = new int[an];
        int[] b = new int[bn];

        // Copy the values
        for (int i = 0; i < an; i++)
        {
            a[i] = arr[l + i];
        }

        for (int j = 0; j < bn; j++)
        {
            b[j] = arr[m + 1 + j];
        }

        // Merge two sorted arrays
        int i = 0;
        int j = 0;
        int k = l;
        while (i < an && j < bn)
        {
            if (a[i] < b[j])
            {
                arr[k++] = a[i++];
            }
            else
            {
                arr[k++] = b[j++];
            }
        }
        while (i < an)
        {
            arr[k++] = a[i++];
        }
        while (j < bn)
        {
            arr[k++] = b[j++];
        }
    }
    void mergeSort(int arr[], int l, int r)
    {
        //code here
         if (l >= r)
            return;
        int mid = l + (r - l) / 2; 
        mergeSort(arr, l, mid);
        mergeSort(arr, mid + 1, r);
        merge(arr, l, mid, r);
    }
}
