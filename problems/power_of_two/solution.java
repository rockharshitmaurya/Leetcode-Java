class Solution {
    public boolean isPowerOfTwo(int n) {
      //  return n>0 && ((n&(n-1))==0);
        return n>0 && Integer.bitCount(n)==1;
    }
}