class Solution {
    public List<Integer> pancakeSort(int[] arr) {
        int target=1,pos=arr.length-1;
        List<Integer> ans=new ArrayList<>();
        
        while(pos>=0){
            int index=getIndex(arr,pos,target++);
            if(index!=pos){
                    ans.add(index+1);
                    ans.add(pos+1);
                    reverse(arr,0,index);
                    reverse(arr,0,pos);
                    pos--;
            }else{
                pos--;
            }
        }
        ans.add(arr.length);
        // System.out.println(Arrays.toString(arr));
        return ans;
    }
    int getIndex(int arr[],int pos,int val){
        for(int i=pos; i>=0; i--)
            if(arr[i]==val)
                return i;
        return -1111;
    }
    void reverse(int[] arr, int l, int r) {
		int d = (r - l + 1) / 2;
		for (int i = 0; i < d; i++) {
			int t = arr[l + i];
			arr[l + i] = arr[r - i];
			arr[r - i] = t;
		}
	}
}
