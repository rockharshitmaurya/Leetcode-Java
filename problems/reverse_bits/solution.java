public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
       int y=0;
        for(int i=0; i<32; i++){
            y=y<<1;
            y=y^(n&1);
            n=n>>1;
        }
        return y;
    }
}