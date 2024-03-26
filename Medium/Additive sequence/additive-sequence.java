//{ Driver Code Starts
import java.util.*;

public class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            Solution ss = new Solution();
            boolean result = ss.isAdditiveSequence(s);
            System.out.println((result == true ? 1 : 0));
        }
        sc.close();
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {
    public boolean isAdditiveSequence(String n) {
        // code here
        long first, second;
        int l = Math.min(18, n.length());
        for(int i = 0; i<l; i++){
            for(int j = i+1; j<l; j++){
                first = Long.parseLong(n.substring(0, i+1));
                second = Long.parseLong(n.substring(i+1, j+1));
                if(isAdditiveSequence(n, j+1, first, second)) return true;
            }
        }
        return false;
    }
    public static boolean isAdditiveSequence(String s, int st, long prev, long cur){
    int n = s.length();
    while (true){
        long sum = prev+cur;
        int len = len(sum);
        if(st+len > n){
            break;
        }
        long temp = sum;
        for(int i = len+st-1; i>= st; i--, temp /= 10){
            if(s.charAt(i) - '0' != (temp%10)) return false;
        }
        if(len+st == n) return true;
        st += len;
        prev = cur;
        cur = sum;
    }
    return false;
    }

static int len(long sum){
    int res = 0;
    while (sum > 0){
        res++;
        sum /= 10;
    }
    return res;
}
}
