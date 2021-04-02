class Solution {
    
    public double average(int[] salary) {
    double min=Double.MAX_VALUE,max=Double.MIN_VALUE,sum=0;
        for(int num:salary){
           sum+=num;
            min=Math.min(min,num);
            max=Math.max(max,num);
        }
        //System.out.println(min+" "+max);
        return (sum-(min+max))/(salary.length-2);
    }
}