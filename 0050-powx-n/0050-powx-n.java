class Solution {
   public double myPow(double x, int n) {

          if(n>=0)
          {
                return power(x,n);
          } 
          else
           return (1/power(x,n*-1));
          
    }
    public double power(double x,int n)
    {
         if(n==0) return 1;
         if(n==1) return x;

         if(n%2==0){
               double ans =power(x,n/2);
               return ans*ans;
         }
         else{
              double ans =power(x,n/2);
              return ans*ans*x;
         }

    }
}