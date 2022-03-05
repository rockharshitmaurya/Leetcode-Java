class Solution {
    public int mostFrequent(int[] nums, int key) {
        ArrayList<Integer> list=new ArrayList<>();
        int len=nums.length;
        for(int i=0; i<len-1; i++){
            if(nums[i]==key) list.add(i);
        }
        int target=nums[list.get(0)+1],count=1;
        for(int num:list){
            int key2=nums[num+1];
            int temp=0;
            for(int i=num; i<len-1; i++){
                if(nums[i+1]==key2) temp++;
            }
            if(temp>count){
                temp=count;
                target=key2;
            }
        }
        return target;
        
    }
}