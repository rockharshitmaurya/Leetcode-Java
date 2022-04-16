class Solution {
    public int fib(int n) {
        if(n==0) return 0;
        int arr[]=new int[n+1];
        arr[1]=1;
        for(int i=2; i<=n; i++){
            arr[i]=arr[i-1]+arr[i-2];
        }
        return arr[n];
    }
}