class Solution {
    public int arrangeCoins(int n) {
        long l=0,r=n;
        while(l<=r){
            long mid=l+(r-l)/2;
            long now=mid*(mid+1)/2;
            if(now==n) return (int)mid;
            if(now<n){
            l=mid+1;
            }else{
                r=mid-1;
            }
        }
        return (int)r;
    }
}