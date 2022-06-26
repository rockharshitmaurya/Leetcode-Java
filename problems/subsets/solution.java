class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        helpr(nums,nums.length,0,new ArrayList<Integer>(),ans);
        return ans;
    }
    static void helpr(int arr[],int n,int i,ArrayList<Integer> list,List<List<Integer>> ans){
        if(i==n){
            // System.out.println(list);
            ans.add(new ArrayList<>(list));
            return;
        }
        list.add(arr[i]);
            //Take the particular index into Subsequences
        helpr(arr,n,i+1,list,ans);
        list.remove(list.size()-1);
            //Do Not Take the particular index into Subsequences
        helpr(arr,n,i+1,list,ans);
    }

}