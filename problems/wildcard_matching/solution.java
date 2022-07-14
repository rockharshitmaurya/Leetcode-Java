class Solution {
    public boolean isMatch(String p, String s) {
        int n=s.length(),m=p.length();
        boolean dp[][]=new boolean[n+1][m+1];
        dp[0][0]=true;
        for(int i=1; i<=n; i++){
            boolean flag=true;
            for(int idx=1; idx<=i; idx++) 
                if(s.charAt(idx-1)!='*'){
                    flag=false;
                    break;
                }
            dp[i][0]=flag;
        }
        
        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                
                if(s.charAt(i-1)=='?' || s.charAt(i-1)==p.charAt(j-1)) dp[i][j]=dp[i-1][j-1];
                else if(s.charAt(i-1)=='*'){
                    boolean ignoreStar=dp[i-1][j];
                    boolean doesNotIgnore=dp[i][j-1];
                    dp[i][j] = ignoreStar ||  doesNotIgnore;
                }else{
                    dp[i][j]=false;
                }
            }
        }
        return dp[n][m];
      // return helper(s,p,s.length(),p.length());
    }
    boolean helper(String s,String p,int i,int j){
        
        if(i==0 && j==0) return true;
        
        if(i==0 && j>0) return false;
        
        if(j==0 && i>0){
            for(int idx=0; idx<i; idx++) 
                if(s.charAt(idx)!='*') return false;
            return true;
        }
        
        if(s.charAt(i-1)=='?' || s.charAt(i-1)==p.charAt(j-1)) return helper(s,p,i-1,j-1);
        
        if(s.charAt(i-1)=='*'){
            boolean ignoreStar=helper(s,p,i-1,j);
            boolean doesNotIgnore=helper(s,p,i,j-1);
            return ignoreStar ||  doesNotIgnore;
        }
        return false;
    }
}
