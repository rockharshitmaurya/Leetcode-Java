class Solution {
    public int longestStrChain(String[] words) {
        Arrays.sort(words,(o1,o2)->(o1.length()-o2.length()));
        
         int dp[]=new int[words.length];
         Arrays.fill(dp,1); int ans=0;
        
        for(int i=0; i<words.length; i++){
            for(int j=i-1; j>=0; j--){
                if(check(words[i],words[j]) && 1+dp[j]>dp[i]){
                    dp[i]=1+dp[j];
                }
            }
            if(dp[i]>ans){
                ans=dp[i];
            }
        }
        return ans;
    }
    boolean check(String str1,String str2){
        if(str1.length()!=str2.length()+1) return false;
        int idx1=0,idx2=0;
        while(idx1<str1.length()){

            if(idx2<str2.length() && str1.charAt(idx1)==str2.charAt(idx2)){
                idx1++; idx2++;
            }else{
                idx1++;
            }
        }
        return idx1==str1.length() && idx2==str2.length();
    }
}