class Solution {
    public int repeatedNTimes(int[] A) {
        int count=1,num=0;
       //  for(int i=1; i<A.length; i++){
       //      if(A[num]==A[i]){
       //          count++;
       //      }else{
       //          count--;
       //      }
       //      if(count==0){
       //          count=1;
       //          num=i;
       //      }
       //  }
       // // System.out.println(num);
       //  return A[num];
       for(int i=2; i<A.length; i++)
           if(A[i]==A[i-1] || A[i]==A[i-2])
               return A[i];
        return A[0];
    }
}