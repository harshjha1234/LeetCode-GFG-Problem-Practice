//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.smithNum(n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static boolean isPrime(int n){
        if(n == 1){
            return false;
        }
        for(int i=2; i<=Math.sqrt(n); ++i){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    static int Primesum(int n){
        int f = 1;
        int psum = 0;
        
        while(n > 1){
            ++f;
            if(!isPrime(f)){
                continue;
            }
            while(n % f == 0){
                psum += digitsum(f);
                n = n / f;
            }
        }
        return psum;
    }
    static int digitsum(int num){
        int sum = 0;
        while(num > 0){
            int q = num % 10;
            sum += q;
            num = num / 10;
        }
        return sum;
    }
    static int smithNum(int n) {
        // code here
        if(isPrime(n)){
            return 0;
        }
        if(Primesum(n) == digitsum(n)){
           return 1; 
        }
        return 0;
    }
};