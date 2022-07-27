class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        int n=days.length;
        int max=days[n-1]+30;
        int dp_prev[]=new int[max+1];
        
        for(int idx=n-1; idx>=0; idx--){
                int dp_cur[]=new int[max+1];
            for(int limit=days[idx]+30; limit>=0; limit--){
                if(days[idx]<limit) dp_cur[limit]=dp_prev[limit]; 
                else{
                    int one_day=costs[0]+dp_prev[days[idx]];
                    int seven_day=costs[1]+dp_prev[days[idx]+7];
                    int thirty_day=costs[2]+dp_prev[days[idx]+30];
                    dp_cur[limit]=Math.min(one_day,Math.min(seven_day,thirty_day));
                }
            }
            dp_prev=dp_cur;
        }
        return dp_prev[0];
        
    }
    int helper(int days[],int costs[],int idx,int limit,int dp[][]){
        if(idx>=days.length) return 0;
        if(dp[idx][limit]!=-1) return dp[idx][limit];
        
        if(days[idx]<limit) return helper(days,costs,idx+1,limit,dp); 
        
        int one_day=costs[0]+helper(days,costs,idx+1,days[idx],dp);
        int seven_day=costs[1]+helper(days,costs,idx+1,days[idx]+7,dp);
        int thirty_day=costs[2]+helper(days,costs,idx+1,days[idx]+30,dp);
        
        return dp[idx][limit]=Math.min(one_day,Math.min(seven_day,thirty_day));
    }
}
// 0 1 2 3 4 5 6 7 8 9 10 11