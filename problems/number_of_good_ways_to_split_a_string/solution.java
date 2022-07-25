class Solution {
    public int numSplits(String s) {
        Set<Character> set=new HashSet<Character>();
        int n=s.length();
        int pre[]=new int[n];
        int suff[]=new int[n];
        
        for(int i=0; i<n; i++){
            set.add(s.charAt(i));
            pre[i]=set.size();
        }
        set.clear();
        for(int i=n-1; i>=0; i--){
            set.add(s.charAt(i));
            suff[i]=set.size();
        }
        int ans=0;
        for(int i=0; i<n-1; i++){
            if(pre[i]==suff[i+1]) ans++;
        }
        
        return ans;
    }
}