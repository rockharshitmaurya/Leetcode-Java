class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int max_so_far=values[0];
        int res=0;
        
        for(int i=1; i<values.length; i++){
            res=Math.max(res,max_so_far+values[i]-i);
            max_so_far=Math.max(max_so_far,values[i]+i);
        }
        return res;
    }
}