class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int Time) {
        int res=0;
        for(int i=0; i<startTime.length; i++){
            if(startTime[i]<=Time && endTime[i]>=Time) res++;
        }
        return res;
    }
}