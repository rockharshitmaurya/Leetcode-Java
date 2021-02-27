class Solution {
    public int maximumWealth(int[][] accounts) {
      int max=0;
        int sum=0;
        for(int[] o:accounts){
            for(int i:o){
                sum+=i;
            }
            max=sum>max?sum:max;
            sum=0;
        }
        return max;
    }
}