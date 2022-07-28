class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int n=s.length();
        boolean dp[]=new boolean[n+1];
        Set<String> set=new HashSet<>(wordDict);
        dp[n]=true;
        for(int idx=n-1; idx>=0; idx--){
            boolean found=false; 
            // StringBuilder sb=new StringBuilder();
            for(int i=idx; i<s.length(); i++){
                // sb.append(s.charAt(i));
                String sb=s.substring(idx,i+1);
                if(set.contains(sb)){
                   found|=dp[i+1]; 
                }
            }
            dp[idx]=found;
        }
       return dp[0]; 
    }
    boolean helper(String s,int idx,Set<String> set){
        if(idx==s.length()) return true;
        boolean found=false; StringBuilder sb=new StringBuilder();
        for(int i=idx; i<s.length(); i++){
            sb.append(s.charAt(i));
            if(set.contains(sb.toString())){
               found|=helper(s,i+1,set); 
            }
        }
        return found;
    }
}
