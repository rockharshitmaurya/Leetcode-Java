class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int idx=0;    
        for(int i=1; i<arr.length-1; i++){
            if(arr[i-1]<arr[i] && arr[i]>arr[i+1]) {idx=i; break; }
        }
                
        return idx;
    }
}