class Solution {
    public boolean canJump(int[] A) {
        int i = 0 , n = A.length;
        for (int reach = 0; i < n && i <= reach; ++i)
            reach = Math.max(i + A[i], reach);
        return i == n;
    }
}