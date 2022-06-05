class Solution {
    public int minMaxGame(int[] nums) {
        if(nums.length==1) return nums[0];
        ArrayList<Integer> list=new ArrayList<>();
        int flip=1;
        for(int i=0; i<nums.length; i+=2){
            if(flip==1){
                list.add(Math.min(nums[i],nums[i+1]));
                flip=0;
            }else{
                list.add(Math.max(nums[i],nums[i+1]));
                flip=1;
            }
        }
        while(list.size()!=1){
            if(flip==1){
                list.add(Math.min(list.remove(0),list.remove(0)));
                flip=0;
            }else{
                list.add(Math.max(list.remove(0),list.remove(0)));
                flip=1;
            }
        }
        return (int)list.get(0);
    }
}