class Solution {
    public int countDistinct(int[] nums, int k, int p) {
        Set<String> set=new HashSet<String>();
        for (int startPoint = 0; startPoint <nums.length ; startPoint++) {
            StringBuilder sb=new StringBuilder();
            int div=0;
          for (int grps = startPoint; grps <nums.length ; grps++) {
             
               // for (int j = startPoint ; j < grps ; j++) {
                  sb.append((char)nums[grps]);
                  if(nums[grps]%p==0) div++;
               // }
                 if(div<=k && sb.length()!=0) set.add(sb.toString());
            
         }
         }
        return set.size();
    }
}