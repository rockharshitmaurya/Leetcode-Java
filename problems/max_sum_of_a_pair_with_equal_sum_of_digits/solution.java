class Solution {
    public int maximumSum(int[] nums) {
        int arr[][]=new int[nums.length][2];
        
        for(int i=0; i<nums.length; i++){
            arr[i][0]=nums[i];
            arr[i][1]=sum(nums[i]);
        }
        Arrays.sort(arr,(o1,o2)->(o2[1]-o1[1]));
        // System.out.println(Arrays.deepToString(arr));
        int ans=0,value=0,d_sum=0;
        for(int sub[]:arr){
            if(sub[1]!=d_sum){
                d_sum=sub[1];
                value=sub[0];
            }else if(d_sum==sub[1]){
                
                ans=Math.max(ans,value+sub[0]);  
                if(sub[0]>value){
                        value=sub[0];
                }
            }
        }
        
        return ans==0?-1:ans;
        
    }
    int sum(int no)
    {
        return no == 0 ? 0 : no%10 +
                  sum(no/10) ;
    }
}