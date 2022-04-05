class Solution {
    public int maxArea(int[] height) {
      int start=0,end=height.length-1;
        int ans=0;
        while(start<end){
            // int mul=end-start;
            // int min=Math.min(height[start],height[end]);
            ans=Math.max(ans,((end-start)*Math.min(height[start],height[end])));
            if(height[start]<height[end]) start++;
            else end --;
        }
        return ans;
    }
}