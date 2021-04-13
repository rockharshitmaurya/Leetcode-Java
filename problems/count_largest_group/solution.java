class Solution {
    int dsum(int n){
        return n==0?0:n%10+dsum(n/10);
    }
    public int countLargestGroup(int n) {
        int max=0,res=0;
        int map[]=new int[37];
        for(int i=1; i<=n; i++){
            int sum=dsum(i);
            if(++map[sum]>max){
                max=map[sum];
                res=1;
            }else if(max==map[sum]){
                res++;
            }
            
        }
        return res;
    }
}