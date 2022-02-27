class Solution {
    public long minimumTime(int[] time, int t_trip){
        long l=1,r=(long)1e14;
        while(l<r){
            long mid=l+(r-l)/2,trips=0;
            for(int val:time)
                trips+=mid/val;
            if(trips<t_trip)
                l=mid+1;
            else
                r=mid;
        }
        return l;
    }

}