class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        int max=0;
        int count[]=new int[46];
        for(int i=lowLimit; i<=highLimit; i++){
            int num=i,sum=0;
            while(num>0){
               sum+=num%10;
                num=num/10;
            }
            max=Math.max(++count[sum],max);
        }
        return max;
    }
}