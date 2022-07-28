class Solution {
    public int maxProduct(int[] A) {
       int max=Integer.MIN_VALUE,left_product=1,right_product=1,n=A.length;
        
        for(int i=0; i<n; i++){
            //left scan
            max=Math.max(left_product *= A[i] , max);
            if(A[i]==0) left_product=1;
            
            max=Math.max(right_product *= A[n-i-1] , max);
            if(A[n-i-1]==0) right_product=1;
        }
        
        return max;
    }
}