class Solution {
    public int countNicePairs(int[] nums) {
//         int count=0;
//         HashSet<String> set=new HashSet<String>();
//         for(int i=0; i<nums.length-1; i++){
//             for(int j=i+1; j<nums.length; j++){
//                  StringBuilder input = new StringBuilder();
//                 input.append(nums[i]+" "+nums[j]);
//                // String val=nums[i]+" "+nums[j];
//                 if(set.contains(input.toString())){
//                     count++;
//                     continue;
//                 }
//                 int first=nums[i];
//                 int sec=res(nums[j]);
//                 int first1=nums[j];
//                 int sec2=res(nums[i]);
//                if((first+sec)==(first1+sec2))
//                {
                   
//                    set.add(input.toString());
//                    count++;
//                }
//             }
//         }
        
//         return count%100000007;
    Map<Integer, Integer> map = new HashMap<>();
	int result = 0, key,mod = (int)1e9 + 7;
        for(int num:nums){
            key=num-res(num);
            if(map.containsKey(key)){
                result=(result+map.get(key))%mod;
            }
            map.put(key,map.getOrDefault(key,0)+1);
        }
        return result;
    }
    int res(int i){
       
                int res = 0;
        while (i > 0) {
        res = res * 10 + i % 10;
        i /= 10;
        }
        return res;
    }
}