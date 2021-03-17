class Solution {
    public int[] sortArrayByParity(int[] A) {
        int len=A.length,start=0,last=A.length-1,count=0;
        int arr[]=new int[len];
        
        while(count!=len){
            if(A[count]%2==0){ arr[start]=A[count]; start++;}
            else {arr[last]=A[count]; last--;}
            count++;
        }
        return arr;
    }
}