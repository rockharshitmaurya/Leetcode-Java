class Solution {
    public int getNumberOfBacklogOrders(int[][] orders) {
       PriorityQueue<int[]> sell=new PriorityQueue<>((a,b)->(a[0]-b[0]));
        PriorityQueue<int[]> buy=new PriorityQueue<>((a,b)->(b[0]-a[0]));
        for(int o[]:orders){
            if(o[2]==0)
                buy.offer(o);
            else
                sell.offer(o);
        while(!sell.isEmpty() && !buy.isEmpty() && sell.peek()[0]<=buy.peek()[0]){
            int k=Math.min(sell.peek()[1],buy.peek()[1]);
            sell.peek()[1]-=k;
            buy.peek()[1]-=k;
            if(sell.peek()[1]==0) sell.poll();
            if(buy.peek()[1]==0) buy.poll();
        }
    }
        int res = 0, mod = 1000000007;
        for (int[] o : sell)
            res = (res + o[1]) % mod;
        for (int[] o : buy)
            res = (res + o[1]) % mod;
        return res;
    }
}