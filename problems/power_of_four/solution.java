class Solution {
    public boolean isPowerOfFour(int n) {
//        if(n<0) return false;
        
//         for(int i=0; i<32; i+=2){
//             if(n==(1<<i)) return true;
//         }
//         return false;
        return n>0 && (n&(n-1))==0 && (n & 0x55555555)==n;
    }
}