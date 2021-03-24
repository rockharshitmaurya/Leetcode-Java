class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        List<Integer> list=new ArrayList<Integer>();
        Arrays.sort(nums);
        int start=0,end=nums.length-1,sum=0,endsum=nums[end];
        list.add(nums[end]);
        while(start<end){
              if(sum<endsum)sum+=nums[start++];         
              else{
                    sum-=nums[--start]; int num=nums[--end];  
                    endsum+=num;        list.add(num);
              }
        }
        if(sum>=endsum) list.add(nums[--end]);
        return list;
    }
}