class Solution {
    public int largestAltitude(int[] gain) {
     int totle=0,max=0;
        for(int i:gain){
            totle+=i;
            max=Math.max(totle,max);
        }
        return max;
    }
}