class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);
        helpr(nums,nums.length,0,new ArrayList<Integer>(),ans);
        return ans;
    }
    static void helpr(int arr[],int n,int idx,ArrayList<Integer> list,List<List<Integer>> ans){
        // if(idx==n){
            ans.add(new ArrayList<>(list));
            // return;
        // }
        for(int i=idx; i<n; i++){
            if(i>idx && arr[i]==arr[i-1]) continue;
        list.add(arr[i]);
            //Take the particular index into Subsequences
        helpr(arr,n,i+1,list,ans);
        list.remove(list.size()-1);
            //Do Not Take the particular index into Subsequences
        }
    }
}