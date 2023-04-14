/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int l = 0;
        int h = n;

        while(l<=h){
            int m = l + (h-l)/2;
            if(isBadVersion(m)==true && isBadVersion(m-1)==false)  {
                return m;
            }
            else if(isBadVersion(m)==false ) {
                l = m+1;
            }
            else {
                h= m;
            }
        }     
        return -1;
    }
}
