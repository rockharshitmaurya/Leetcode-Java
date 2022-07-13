class Solution {
    public int longestPalindromeSubseq(String text1) {
        String text2=new StringBuilder(text1).reverse().toString(); // question boild down to find longest comman subsequnece #striverDP26
        int n=text1.length(),m=text2.length();
         int dp[][]=new int[n+1][m+1];
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