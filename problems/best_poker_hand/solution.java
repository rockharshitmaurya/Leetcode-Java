class Solution {
    public String bestHand(int[] ranks, char[] suits) {
        int r_count[]=new int[15];
        int s_count[]=new int[6];
        
        for(int num: ranks) r_count[num]++;
        
        for(char ch:suits) s_count[ch-'a']++;
        
        for(int su:s_count){
            if(su==5){
                return "Flush";
            }
        }
        
        for(int rn:r_count){
            if(rn>=3){
                return "Three of a Kind";
            }
        }
        
        for(int rn:r_count){
            if(rn>=2){
                return "Pair";
            }
        }
        
        return "High Card";
    }
}