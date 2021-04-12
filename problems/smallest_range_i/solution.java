class Solution {
    public int smallestRangeI(int[] A, int k) {
    int n = A.length;
        int min = A[0];
        int max = A[0];
        
        for(int i = 0; i < n; i++){
            min = Math.min(min,A[i]);
            max = Math.max(max,A[i]);
        }
        

        return (min+k >= max-k) ? 0 : (max-k) - (min+k);
    }
}