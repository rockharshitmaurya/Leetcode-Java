class Solution {
    public int maximumUnits(int[][] bt, int ts) {
        Arrays.sort(bt,(o1,o2)->(o2[1]-o1[1]));
        // System.out.println(Arrays.deepToString(bt));
        int ans=0;
        for(int arr[]:bt){
             if(ts==0) break;
            int sub=Math.min(ts,arr[0]);
            ts-=sub;
            ans+=(sub*arr[1]);
        }
        return ans;
    }
}