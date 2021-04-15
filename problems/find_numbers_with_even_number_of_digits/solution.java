class Solution {
    int dlen(int len){
        return len==0?0:1+dlen(len/10);
    }
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i:nums)
            if(dlen(i)%2==0) count++;
        return count;
    }
}