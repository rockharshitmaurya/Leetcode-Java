class Solution {
    public int minDeletions(String s) {
        int count[]=new int[26];
        for(char ch:s.toCharArray()) count[ch-'a']++;
        HashSet<Integer> set=new HashSet<>();
        int ans=0;
        for(int i=0; i<26; i++){
                while(count[i]>0){
                    if(!set.contains(count[i])){
                        set.add(count[i]);
                        break;
                    }
                    ans++;
                    count[i]--;
                }
        }
        return ans;
    }
}