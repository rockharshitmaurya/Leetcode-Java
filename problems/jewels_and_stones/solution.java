class Solution {
    public int numJewelsInStones(String jewels, String stones) {
     int count=0;
        for(char c:jewels.toCharArray()){
         for(char c1:stones.toCharArray()){
             if(c==c1) count++;
         }
     } 
        return count;
    }
}