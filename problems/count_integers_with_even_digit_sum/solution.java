class Solution {
    public int countEven(int num) {
       int count=0;
        for(int i=1; i<=num; i++){
            if(d_sum(i)%2==0) count++;
        } 
        return count; 
    }
    int d_sum(int num){
        int sum=0;
        while(num!=0){
            sum+=num%10;
            num=num/10;
        }
        return sum;
    }
}