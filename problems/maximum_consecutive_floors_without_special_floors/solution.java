class Solution {
    public int maxConsecutive(int bottom, int top, int[] sp) {
        Arrays.sort(sp);
        long ans=0;
        for(int i=1; i<sp.length; i++){
            ans=Math.max(ans,sp[i]-sp[i-1]-1);
        }
        ans=Math.max(ans,sp[0]-bottom);
        ans=Math.max(ans,top-sp[sp.length-1]);
        return (int)Math.max(ans,0);
    }
}