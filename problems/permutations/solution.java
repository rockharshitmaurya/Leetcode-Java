class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        helpr(nums,nums.length,0,ans);
        return ans;
    }
        //This is Approch 2 , there is a submisson for approch 1 also
       void helpr(int arr[],int n,int idx,List<List<Integer>> ans){
        if(idx==n){ ///if index is crossing the array boundary then push the current state of permutated numbers
        				//in the array to ans
            ArrayList<Integer> ds=new ArrayList<>();
            for(int num:arr) ds.add(num);
            ans.add(new ArrayList<>(ds));
        }
        for(int i=idx; i<n; i++){ //try swapping this number with every number ahead
            swap(arr,i,idx); // swap each element till its nTh elemnt
            helpr(arr,n,idx+1,ans);//recursively call the function from next index
            swap(arr,i,idx); //swap back to original state so that when recursion call returns to this level it can explore other possibilites
        }
    }
    void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

}