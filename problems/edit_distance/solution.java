class Solution {
    int dp[][];
    public int minDistance(String word1, String word2) {
        int n=word1.length(),m=word2.length();
        dp=new int[n+1][m+1];
        // for(int arr[]:dp)   Arrays.fill(arr,-1);
        for(int i=0; i<=n; i++) dp[i][0]=i;
        for(int j=0; j<=m; j++) dp[0][j]=j;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                if(word1.charAt(i-1)==word2.charAt(j-1))
                    dp[i][j]=dp[i-1][j-1];
                else{
                    int insert=1+dp[i][j-1];
                    int delete=1+dp[i-1][j];
                    int replace=1+dp[i-1][j-1];
                    dp[i][j]=Math.min(insert,Math.min(delete,replace));
                }
            }
        }
        return dp[n][m];
    }
    int helper(String str1,String str2, int i,int j){
        if(i==0) return j;
        if(j==0) return i;
        if(dp[i][j]!=-1) return dp[i][j];
        if(str1.charAt(i-1)==str2.charAt(j-1)) return dp[i][j]=helper(str1,str2,i-1,j-1);
        int insert=1+helper(str1,str2,i,j-1);
        int delete=1+helper(str1,str2,i-1,j);
        int replace=1+helper(str1,str2,i-1,j-1);
        return dp[i][j]=Math.min(insert,Math.min(delete,replace));
    }
}