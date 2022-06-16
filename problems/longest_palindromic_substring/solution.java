class Solution {
    public String longestPalindrome(String s) {
        boolean dp[][]=new boolean[s.length()][s.length()];
        String ans="";
        for(int g=0; g<s.length(); g++){
            for(int i=0,j=g; j<s.length(); i++,j++){
                if(g==0){
                    dp[i][j]=true;
                }else if(g==1){
                    if(s.charAt(i)==s.charAt(j)) dp[i][j]=true;
                }else{
                    if(s.charAt(i)==s.charAt(j) && dp[i+1][j-1]==true) dp[i][j]=true;
                }
                if(dp[i][j]){
                    String mid=s.substring(i,j+1);
                    ans=mid;
                }
            }
        }
        // System.out.println(ans);
        return ans;
    }
}