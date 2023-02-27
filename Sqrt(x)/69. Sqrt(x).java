class Solution {
    public int mySqrt(int x) {
       int s=1;
       int e=x;
       int f=0;
       while(s <= e){
           int mid =s+(e-s)/2;

           if(mid<=x/mid){
               f=mid;
               s=mid+1;
           }
           else{
               e=mid-1;
           }
       } 
       return f;
    }
}
