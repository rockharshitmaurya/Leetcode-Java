class Solution {
    public int arraySign(int[] nums) {
        int res=1;
        for(int n:nums){
            res*=Integer.signum(n);
        }
        return res;
    }
}