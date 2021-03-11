class Solution {
    public int[] sumZero(int n) {
      int arr[]=new int[n];
        int num=n/2;
        for(int i=0; i*2<n; i++){
            arr[i]=num;
            arr[n-i-1]=-num;
            num--;
        }
        return arr;
    }
}