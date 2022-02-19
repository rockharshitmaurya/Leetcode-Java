class Solution {
    public long[] sumOfThree(long num) {
        long num1=(num-3)/3;
        long num2=num1+1;
        long num3=num2+1;
        if(num1+num2+num3==num){
          return new long[]{num1,num2,num3};  
        }else return new long[0];
    }
}