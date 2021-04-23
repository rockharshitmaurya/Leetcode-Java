class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int res=0,len=piles.length-2,i=0;
        while(i<len){
            i++;
            res+=piles[len];
            len-=2;
        }
        return res;  
      
    }
}
//1-2-3-4-5-6-7-8-9