class Solution {
    public long minimumRemoval(int[] beans) {
      Arrays.sort(beans);
        long res=Long.MAX_VALUE;
        long sum=0;
        long len=beans.length;
        for(int i=0; i<len; i++){
            sum+=(long)beans[i];
        }
         for(int i=0; i<len; i++){
            res=Math.min(res,sum-(len-i)*beans[i]);
        }
        return res;
    }
}