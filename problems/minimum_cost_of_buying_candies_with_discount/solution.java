class Solution {
    public int minimumCost(int[] cost) {
        // if(cost.length==1) return cost[0];
        Arrays.sort(cost);
        int res=0,count=0;
        for(int i=cost.length-1; i>=0; i--){
            if(count<2){
             res+=cost[i];
                count++;
            }else{
                count=0;
            }
        }
        return res;
    }
}