class Solution {
    public String shortestCommonSupersequence(String str1, String str2) {
        return longestCommonSubsequence(str1,str2);
    }
    public String longestCommonSubsequence(String text1, String text2) {
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
        String ans="";
        while(n>0 && m>0){
            if(text1.charAt(n-1)==text2.charAt(m-1)){
                ans=text1.charAt(n-1)+ans;
                n--; m--;
            }else if(dp[n-1][m]>dp[n][m-1]){
                ans=text1.charAt(n-1)+ans;
                n--; 
            }else{
                ans=text2.charAt(m-1)+ans;
                m--;
            }
        }
        while(n>0) { 
            ans=text1.charAt(n-1)+ans;
            n--;
        }
        while(m>0){
          ans=text2.charAt(m-1)+ans;
            m--;
        } 
        // System.out.println(ans);
        return ans;
        
    }
}

