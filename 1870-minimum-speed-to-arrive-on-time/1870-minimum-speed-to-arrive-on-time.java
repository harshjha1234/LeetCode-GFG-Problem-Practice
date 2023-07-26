class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        if(hour<dist.length-1) return -1;
        int l = 0;
        int r = 10000000;
        int m;
        int ans = -1;
        while(l<=r){
            m = (l+r)/2;            
            if(check(dist, hour, m)){
                ans = m;
                r = m-1;
            }else{
                l = m+1;
            }
        }
        return ans;
    }

    public boolean check(int [] dist, double hour, double speed){
       
        double time = 0;
        int i = 0;
        while(time<=hour && i<dist.length-1){
            time += Math.ceil(dist[i]/speed);
            i++;
        }
        time +=dist[dist.length-1]/speed;
        return (time<=hour);
    }
}