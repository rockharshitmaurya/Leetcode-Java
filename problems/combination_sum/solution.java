class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        helper(candidates,0,target,ans,new ArrayList<Integer>());
        return ans;  
    }
    void helper(int arr[],int i,int target,List<List<Integer>> res,List<Integer> ds){
        if(i==arr.length){
            if(target==0){
                res.add(new ArrayList<>(ds));
            }
            return;
        }
        if(arr[i]<=target){ //only pick when the current element is less than or equal to target
            ds.add(arr[i]); // add curent element
                            //insted of adding current elemnt to a new variable we will try to reduce the current target to zero
            helper(arr,i,target-arr[i],res,ds); //pick, pick and pick the current element until , the target become less than the current element
            ds.remove(ds.size()-1); //remove the current element
        }
        helper(arr,i+1,target,res,ds);
    }
}