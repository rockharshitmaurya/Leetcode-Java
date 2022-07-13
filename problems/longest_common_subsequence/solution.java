class Solution {
    int dp[][];
    public int longestCommonSubsequence(String text1, String text2) {
        int n=text1.length(),m=text2.length();
        dp=new int[n+1][m+1];
        // for(int arr[]:dp) Arrays.fill(arr,-1);
        // return helper(text1,text2,n,m);
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
        // String ans="";
        // while(n>0 && m>0){
        //     if(text1.charAt(n-1)==text2.charAt(m-1)){
        //         ans=text1.charAt(n-1)+ans;
        //         n--; m--;
        //     }else if(dp[n-1][m]>dp[n][m-1]){
        //         n--;
        //     }else{
        //         m--;
        //     }
        // }
        // System.out.println(ans);
        // for printning the longest cmmman subsequnece
        return dp[n][m];
        
    }
    // int helper(String str1,String str2,int idx1,int idx2){
    //     if(idx1==0 || idx2==0) return 0;
    //     if(dp[idx1][idx2]!=-1) return dp[idx1][idx2];
    //     if(str1.charAt(idx1-1)==str2.charAt(idx2-1)) return 1+helper(str1,str2,idx1-1,idx2-1);        if(str1.charAt(idx1-1)==str2.charAt(idx2-1)) return 1+helper(str1,str2,idx1-1,idx2-1);
    //     int left=helper(str1,str2,idx1-1,idx2);
    //     int right=helper(str1,str2,idx1,idx2-1);
    //     return dp[idx1][idx2]=Math.max(left,right);
    //     int left=helper(str1,str2,idx1-1,idx2);
    //     int right=helper(str1,str2,idx1,idx2-1);
    //     return dp[idx1][idx2]=Math.max(left,right);
    // }
}