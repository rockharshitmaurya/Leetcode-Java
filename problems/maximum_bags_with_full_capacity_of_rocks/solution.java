class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int ad) {
        int n=rocks.length;
        int need[]=new int[n];
        for(int i=0; i<n; i++){
            need[i]=capacity[i]-rocks[i];
        }
        Arrays.sort(need);
        int count=0;
        for(int i=0; i<n; i++){
            if(need[i]<=ad) ad-=need[i];
            else break;
            count++;
        }
        return count;
    }
}