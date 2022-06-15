class Solution {
    public int longestStrChain(String[] words) {
        HashMap<String,Integer> dp=new HashMap<>();
        Arrays.sort(words, (a, b)->a.length() - b.length());
        int res=0;
        for(String str:words){
            int best=0;
            for(int i=0; i<str.length(); i++){
                String prev=str.substring(0,i)+str.substring(i+1);
                best=Math.max(best,dp.getOrDefault(prev,0)+1);
            }
            dp.put(str,best);
            res=Math.max(best,res);
        }
        return res;
    }
}