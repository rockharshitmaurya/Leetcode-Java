class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0) return 0;
        int ans=0,seen=0;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            if(map.containsKey(ch) && map.get(ch)>=seen){
                int idx=map.get(ch);
                seen=idx+1;
            }else{
                ans=Math.max(ans,i-seen);
            }
                map.put(ch,i);
        }
        return ans+1;
    }
}
