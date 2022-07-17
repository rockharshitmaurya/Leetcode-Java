class Solution {
    public int[] numberOfPairs(int[] nums) {
        int count[]=new int[101];
        for(int num:nums){
            count[num]++;
        }
        int pair=0,unpair=0;
        for(int num:count){
            if(num==0) continue;
            pair+=(num/2);
            unpair+=(num%2);
        }
        return new int[]{pair,unpair};
    }
}