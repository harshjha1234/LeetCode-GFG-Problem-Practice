//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0){
            int n = sc.nextInt();
            int p = sc.nextInt();
            ArrayList<Integer> a = new ArrayList<Integer>();
            ArrayList<Integer> b = new ArrayList<Integer>();
            ArrayList<Integer> d = new ArrayList<Integer>();
            
            for(int i=0;i<p;i++)
            {
                a.add(sc.nextInt());
                b.add(sc.nextInt());
                d.add(sc.nextInt());
            }
            
            Solution ob = new Solution();
            ArrayList<ArrayList<Integer>> ans = ob.solve(n, p, a, b, d); 
            System.out.println(ans.size());
            for (int i=0;i<ans.size();i++){ 
                System.out.println(ans.get(i).get(0)+" "+ans.get(i).get(1)+" "+ans.get(i).get(2)); 
            }
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    ArrayList<ArrayList<Integer>> solve(int n, int p, ArrayList<Integer> a ,ArrayList<Integer> b ,ArrayList<Integer> d) 
    { 
         // code here
         ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        int[] m = new int[n + 1];
        int[] cost = new int[n + 1];

        for (int i = 0; i < p; i++) {
            m[a.get(i)] = b.get(i);
            cost[b.get(i)] = d.get(i);
        }

        for (int i = 1; i <= n; i++) {
            if (cost[i] == 0 && m[i] != 0) {
                int end = i;
                int dia = Integer.MAX_VALUE;
                while (m[end] != 0) {
                    end = m[end];
                    dia = Math.min(dia, cost[end]);
                }
                ans.add(new ArrayList<>(Arrays.asList(i, end, dia)));
            }
        }
        return ans;
     }
} 