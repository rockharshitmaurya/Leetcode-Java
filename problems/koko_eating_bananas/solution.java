class Solution {
    public int minEatingSpeed(int[] piles, int h) {
       int left=1,right=1000000000;
        int ans=left;
        while(left<=right){
            int mid=(left+right)/2;
             // System.out.println(mid);
           if(check(piles,h,mid)==true){
                // System.out.println(mid);
                ans=mid;
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return ans;
    }
    boolean check(int arr[],int h, int k){
        int count=0;
        for(int num:arr){
            if(num<=k){
                count++;
            }else{
                int mod=num%k;
                mod=mod>0?1:0;
                num=num/k;
                count+=(mod+num);
            }           
        }
        return count<=h;
    }
}