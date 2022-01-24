class Solution {
    public int numberOfArrays(int[] differences, int lower, int upper) {
        long mx=0,min=0,sum=min;
        for(int i: differences){
            sum+=i;
            mx=Math.max(mx,sum);
            min=Math.min(min,sum);
        }
        return (int)Math.max(0, (upper - lower) - (mx - min) + 1);
        
    }
}