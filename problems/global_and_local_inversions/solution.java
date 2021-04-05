class Solution {
    public boolean isIdealPermutation(int[] A) {
//     for (int i = 0; i < A.length; i++) {
//             if (Math.abs(i - A[i]) > 1)
//                 return false;
//         }

//         return true; 
        int max=A[0];
        for(int i=0; i<A.length-2; i++){
            max=Math.max(max,A[i]);
            if(max>A[i+2]) return false;
        }
        return true;
    }
}