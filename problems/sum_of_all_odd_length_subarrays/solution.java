class Solution {
    public int sumOddLengthSubarrays(int[] A) {
       // int sum=0;
       //  for(int i:arr) sum+=i;
       //  for(int i=0; i<arr.length; i+=2){
       //      System.out.print(arr[i]+" ");
       //  }
       //  System.out.print(arr[arr.length-3]+" ");
       //  return sum;
        int res = 0, n = A.length;
        for (int i = 0; i < n; ++i) {
            res += ((i + 1) * (n - i) + 1) / 2 * A[i];
        }
        return res;
    }
}