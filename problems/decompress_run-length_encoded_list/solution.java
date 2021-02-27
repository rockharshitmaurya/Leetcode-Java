class Solution {
    public int[] decompressRLElist(int[] nums) {
//       int res=0;
//         for(int i=0; i<nums.length; i=+2){ res+=nums[i]; }
        
//         int list1[]=new int[res];
//         int sindex=0;
//         for(int i=0; i<nums.length; i=+2){
//         Arrays.fill(list1,sindex,sindex+nums[i],nums[i+1]);
//             sindex+=nums[i];
//        } 
//         return list1;
        
        int arrSize = 0;
        for (int i = 0; i < nums.length; i += 2) {
            arrSize += nums[i];
        }
        
        int[] result = new int[arrSize];

        int startIdx = 0;
        for (int i = 0; i < nums.length; i += 2) {
            Arrays.fill(result, startIdx, startIdx + nums[i], nums[i + 1]);
            startIdx += nums[i];
        }
        return result;
    }
}