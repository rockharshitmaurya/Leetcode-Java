class Solution {
    public void duplicateZeros(int[] arr) {
        int zero=0;
        for(int num:arr) if(num==0) zero++;
        int len=arr.length+zero-1;
        for(int i=arr.length-1,j=len; i<j; i--,j--){
            if(arr[i]!=0){
                if(j<arr.length) arr[j]=arr[i];
            }else{
                if(j<arr.length) arr[j]=arr[i];
                j--;
                if(j<arr.length) arr[j]=arr[i];
            }
        }
    }
}