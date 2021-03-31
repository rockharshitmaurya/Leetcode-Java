class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
       List<Integer> list=new ArrayList<>();
        int min=0,idx=0;
        lable:
        for(int arr[]:matrix){
            min=arr[0];
            for(int num=0; num<arr.length; num++){
                if(arr[num]<min){
                    min=arr[num];
                    idx=num;
                }
            }
            for(int arr2[]:matrix){
                if(arr2[idx]>min) continue lable;
            }
            list.add(min);
        }
        return list;
    }
}