class Solution {
    public int shipWithinDays(int[] w, int days) {
        int l=0,r=0;
        for(int num:w){
            l=Math.max(l,num);
            r+=num;
        }
       
        while(l<r){
         int mid=(l+r)/2,need=1,cur=0;
         for(int num:w){
            if(num+cur>mid){
                need++;
                cur=0;
            }
            cur+=num;
        }
         if(need>days) l=mid+1;
         else r=mid;
    }
        return l;
    }
}