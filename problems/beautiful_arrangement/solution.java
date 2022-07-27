class Solution {
    public int countArrangement(int n) {
        boolean vis[]=new boolean[n+1];
      return helper(n,0,vis);
    }
    int helper(int n,int len,boolean[] vis){
        if(len==n){
            return 1;
        }
        int ans=0;
        for(int i=1; i<=n; i++){
            if(vis[i]) continue;
            int idx=len+1;
            if(idx%i==0 || i%idx==0){
                vis[i]=true;
                ans+=helper(n,len+1,vis);
                vis[i]=false;
            }
        }
        return ans;
    }
}