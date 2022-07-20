class Solution {
    public int minCost(int n, int[] cuts) {
        int c=cuts.length;
        int cut[]=new int[c+2];
        Arrays.sort(cuts);
        for(int i=0; i<c; i++){
            cut[i+1]=cuts[i];
        }
        cut[c+1]=n;
        
        int dp[][]=new int[c+2][c+2];
        for(int i=c; i>=1; i--){
            for(int j=1; j<=c;j++){
                if(i>j) continue;
                int min=Integer.MAX_VALUE;
                for(int idx=i; idx<=j; idx++){
                    int step=cut[j+1]-cut[i-1]+dp[idx+1][j]+dp[i][idx-1];
                    min=Math.min(min,step);
                }
                dp[i][j]=min;
            }
        }
        return dp[1][c];
    }
}