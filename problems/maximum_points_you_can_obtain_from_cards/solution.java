class Solution {
    public int maxScore(int[] cp, int k) {
        int len=cp.length,sum=0;
        for(int i=0; i<k; i++){
            sum+=cp[i];
        }
        int max=sum;
        for(int i=0; i<k; i++){
            sum=sum-cp[k-i-1]+cp[len-i-1];
            max=Math.max(max,sum);
        }
        return max;
    }
}