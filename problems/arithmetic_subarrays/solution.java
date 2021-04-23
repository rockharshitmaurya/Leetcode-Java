class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> list=new ArrayList<>();
        lable:
        for(int i=0; i<l.length; i++){
            int len=r[i]-l[i]+1;
            int arr[]=new int[len];
            int idx=l[i];
            for(int j=0; j<len; j++)
                arr[j]=nums[idx++];
            Arrays.sort(arr);
            int diff=arr[0]-arr[1];
            for(int k=0; k<arr.length-1; k++){
                if(arr[k]-arr[k+1]!=diff){
                   list.add(false);
                    continue lable; 
                }
            }
            list.add(true);
            // System.out.println(Arrays.toString(arr));
        }
        return list;
    }
}