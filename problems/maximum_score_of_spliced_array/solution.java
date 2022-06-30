class Solution {
    public int maximumsSplicedArray(int[] nums1, int[] nums2) {
        int sum1=0,sum2=0,res1=0,res2=0,max1=0,max2=0,ans=0;
        for(int i=0; i<nums1.length; i++){
            sum1+=nums1[i]; sum2+=nums2[i];
            
            res1+=(nums2[i]-nums1[i]);
            res2+=(nums1[i]-nums2[i]);
            
            max1=Math.max(max1,res1);
            max2=Math.max(max2,res2);
            
            if(res1<0) res1=0;
            if(res2<0) res2=0;

        }
        // System.out.println(sum1+" "+sum2+" "+max1+" "+max2);
        ans=Math.max(sum1,sum2);
        ans=Math.max(ans,sum1+max1);
        ans=Math.max(ans,sum2+max2);
        return ans;
    }
}