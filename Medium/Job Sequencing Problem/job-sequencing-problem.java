//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class Job {
    int id, profit, deadline;
    Job(int x, int y, int z){
        this.id = x;
        this.deadline = y;
        this.profit = z; 
    }
}

class GfG {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //testcases
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
            String inputLine[] = br.readLine().trim().split(" ");
            
            //size of array
            int n = Integer.parseInt(inputLine[0]);
            Job[] arr = new Job[n];
            inputLine = br.readLine().trim().split(" ");
            
            //adding id, deadline, profit
            for(int i=0, k=0; i<n; i++){
                arr[i] = new Job(Integer.parseInt(inputLine[k++]), Integer.parseInt(inputLine[k++]), Integer.parseInt(inputLine[k++]));
            }
            
            Solution ob = new Solution();
            
            //function call
            int[] res = ob.JobScheduling(arr, n);
            System.out.println (res[0] + " " + res[1]);
        }
    }
}
// } Driver Code Ends


class Solution
{
    //Function to find the maximum profit and the number of jobs done.
    int[] JobScheduling(Job arr[], int n)
    {
        // Your code here
        Arrays.sort(arr,(a,b)->b.profit-a.profit);
        
        int max_dead=0;
        for(int i=0;i<n;i++){
            max_dead=Math.max(max_dead,arr[i].deadline);
        }
        
        boolean[] job=new boolean[max_dead];
        int[] res=new int[2];
        
        for(int i=0;i<n;i++){
            int x=arr[i].deadline;
            if(job[x-1]==false){
                res[0]++;
                res[1]+=arr[i].profit;
                job[x-1]=true;
            }
            else{ //if deadline is flexible;fitting it to best possible deadline
                for(int j=x-1;j>=0;j--){
                    if(job[j]==false){
                        res[0]++;
                        res[1]+=arr[i].profit;
                        job[j]=true;
                        break;
                    }
                }
            }
        }
        
        return res;
    }
}

/*
class Job {
    int id, profit, deadline;
    Job(int x, int y, int z){
        this.id = x;
        this.deadline = y;
        this.profit = z; 
    }
}
*/