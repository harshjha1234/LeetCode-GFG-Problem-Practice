//{ Driver Code Starts
import java.util.*;
class PalindromicArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			int n = sc.nextInt();
			int[] a = new int[n];
			for(int i = 0 ;i < n; i++)
				a[i]=sc.nextInt();
			GfG g = new GfG();
			System.out.println(g.palinArray(a , n));
		}
	}
}
// } Driver Code Ends


/*Complete the Function below*/
class GfG
{
    public static boolean Palindrome(int m){
        int num = m;
        int sum =0;
        while(num >0){
            int q = num % 10;
            sum = sum * 10 + q;
            num = num / 10;
        }
        if(sum == m){
            return true;
        }else{
            return false;
        }
    }
	public static int palinArray(int[] a, int n)
    {
        int res = 1;
        for(int i = 0; i<n; i++){
            if(!Palindrome(a[i])){
                res = 0;
                break;
            }
        }
        return res;
    }
}