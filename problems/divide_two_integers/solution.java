class Solution {
    public int divide(int AA, int BB) {
       if (BB == -1 && AA == Integer.MIN_VALUE){
        return Integer.MAX_VALUE;   // Very Special case, since 2^31 is not inside range while -2^31 is within range.
    }
    long B = BB;
    long A = AA;

    int sign = -1;
    if ((A<0 && B<0) || (A>0 && B>0)){
        sign = 1;
    }
    if (A < 0) A = A * -1;
    if (B < 0) B = B * -1;

    int ans = 0;
    long currPos = 1; // necessary to be long. Long is better for left shifting.
    while (A >= B){
        B <<= 1; currPos <<= 1;
    }
    B >>= 1; currPos >>= 1;
    while (currPos != 0){
        if (A >= B){
            A -= B;
            ans |= currPos;
        }
        B >>= 1; currPos >>= 1;
    }
    return ans*sign;
    }
}