/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mArr) {
        int si = 0;
        int ei = mArr.length()-1;
        
        while(si <= ei){
            
            int mid = (si+ei)/2;
            
            if(mArr.get(mid) < mArr.get(mid+1)){
                si = mid+1;
            }else{
                ei = mid-1;
            }
        }
        
        if(mArr.get(si)==target)
            return si;
        
        int fbs = bs(mArr,target,0,si-1,true);
        int sbs = bs(mArr,target,si+1,mArr.length()-1,false);
        
        int min = Math.min(fbs,sbs);
        int max = Math.max(fbs,sbs);
        
        if(min !=-1)
            return min;
        if(max != -1)
            return max;
        return -1;
    }
    
    public int bs (MountainArray mArr, int tar, int si ,int ei, boolean flag){
        
        int ans = -1;
        
        while(si <=ei){
            
            int mid = (si+ei)/2;
            if(mArr.get(mid)==tar){
                ans = mid;
                break;
            }
            else if (mArr.get(mid)<tar){
                if(flag)
                si = mid+1;
                else
                    ei = mid-1;
            }else{
                if(flag)
                ei =mid-1;
                else
                    si= mid+1;
            }     
        }
        
        return ans;
    }
}