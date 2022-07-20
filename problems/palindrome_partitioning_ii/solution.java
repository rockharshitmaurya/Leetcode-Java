class Solution {
    public int minCut(String s) {
        int n=s.length();
        int dp[]=new int[n+1];
        dp[n]=-1; //handle the last cut
        for(int idx=n-1; idx>=0; idx--){
            int min=Integer.MAX_VALUE;
            for(int i=idx; i<s.length(); i++){
                if(isPalindrom(s,idx,i)){
                    int step=1+dp[i+1];
                    min=Math.min(step,min);
                }
            }
            dp[idx]=min;
        }
        return dp[0];
    }
    int helper(String str,int idx){
        if(idx==str.length()) return -1;
        int min=Integer.MAX_VALUE;
        for(int i=idx; i<str.length(); i++){
            if(isPalindrom(str,idx,i)){
                int step=1+helper(str,i+1);
                min=Math.min(step,min);
            }
        }
        return min;
    }
    boolean isPalindrom(String s,int l,int r){
        int n=s.length();
        for(int i=l,j=r; i<=r; i++,j--){
            if(s.charAt(i)!=s.charAt(j)) 
                return false;
        }
        return true;
    }
}