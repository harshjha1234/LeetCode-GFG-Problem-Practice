//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            String s;
            s = br.readLine();

            Solution obj = new Solution();
            String res = obj.oddEven(s);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends



class Solution {
    public static String oddEven(String s) {
        // code here 
        HashMap<Character,Integer> map = new HashMap<>();

        int sum = 0;
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(Map.Entry<Character,Integer> temp:map.entrySet()){
            int pos = temp.getKey() - 'a'+1;
            int freq = temp.getValue();
            if(pos % 2 == 0 &&  freq % 2 == 0){
                sum++;
            }
            else if(pos % 2 == 1 &&  freq % 2 == 1){
                sum++;
            }
        }
        return (sum % 2 == 0) ? "EVEN" : "ODD";
    }
}
