class Solution {
    public int numberOfSteps(int num) {
        if(num==0) return 0;
        return (int)(Math.log(num)/Math.log(2))+Integer.bitCount(num);
    }
}