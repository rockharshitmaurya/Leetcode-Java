class Solution {
    public int largestCombination(int[] can) {
int N=can.length;
        int bit[] = new int[32]; 
        for (int i = 0; i < N; i++) {
            int x1 = 31;
            while (can[i] > 0) {
                if ((int)(can[i] & 1) == (int)1) {
                    bit[x1]++;
                }
                can[i] = can[i] >> 1;
                x1--;
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 32; i++) {
            max = Math.max(max, bit[i]);
        }
        return max;
    }
}