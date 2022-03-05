class Solution {
    public List<List<Integer>> permute(int[] nums) {
       List<List<Integer>> ans=new ArrayList<>();
        ArrayList<Integer> ds=new ArrayList<>();
        boolean freq[]=new boolean[nums.length];
        helper(nums,ans,ds,freq);
        return ans;
    }
    void helper(int nums[],List<List<Integer>> ans,ArrayList<Integer> ds,boolean freq[]){
        if(ds.size()==nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        } 
        for(int i=0; i<nums.length; i++){
            if(!freq[i]){
                ds.add(nums[i]);
                freq[i]=true;
                helper(nums,ans,ds,freq);
                ds.remove(ds.size()-1);
                freq[i]=false;
            }
        }
    }
}