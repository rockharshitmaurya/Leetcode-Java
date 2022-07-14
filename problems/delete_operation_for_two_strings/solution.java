class Solution {
    public int minDistance(String word1, String word2) {
            int val=longestCommonSubsequence(word1,word2);
        return (word1.length()-val)+(word2.length()-val);
    }
        public int longestCommonSubsequence(String text1, String text2) {
        int n=text1.length(),m=text2.length();
        int dp[][]=new int[n+1][m+1];
        for(int i=0; i<=n; i++) dp[i][0]=0;
        for(int j=0; j<=m; j++) dp[0][j]=0;
        
        for(int idx1=1; idx1<=n; idx1++){
            for(int idx2=1; idx2<=m; idx2++){
                        if(text1.charAt(idx1-1)==text2.charAt(idx2-1)) dp[idx1][idx2]=1+dp[idx1-1][idx2-1];
                        else{ 
                            int left=dp[idx1-1][idx2];
                            int right=dp[idx1][idx2-1];
                            dp[idx1][idx2]=Math.max(left,right);
                        }
            }
        }
        return dp[n][m];
        
    }
}