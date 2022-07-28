class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int pre[]=new int[n];
        int suff[]=new int[n];
        pre[0]=height[0];
        suff[n-1]=height[n-1];
        for(int i=1; i<n; i++){
            pre[i]=Math.max(pre[i-1],height[i]);
            suff[n-i-1]=Math.max(suff[n-i],height[n-i-1]);
        }
        
        int ans=0;
        
        for(int i=0; i<n; i++){
            int val=(Math.min(pre[i],suff[i])-height[i]);
            ans+=val; 
        }
        return ans;
    }
}
