class Solution {
    public int minOperations(int n) {
        // int arr[]=new int[n];
        // int res=0,target=0;
        // for(int i=0; i<n; i++){
        //     arr[i]=(2*i)+1;
        //     target+=arr[i];
        // }
        // target=target/n;
        // for(int i=0; i*2<n; i++){
        //     res+=(target-arr[i]);
        // }
        // // System.out.println(Arrays.toString(arr)+" sum : "+target);
        // return res;
        return n*n/4;
    }
}