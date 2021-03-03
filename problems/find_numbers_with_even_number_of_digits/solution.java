class Solution {
    public int findNumbers(int[] nums) {
      int count=0,c=0;
        for(int i:nums){
            while(i>0){
                i=i/10;
                count++;
            }
            if(count%2==0){
            c++;
            }
            count=0;
        }
        return c;
    }
}