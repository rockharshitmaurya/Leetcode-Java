class Solution {
    public int[] countBits(int n) {
        int count[]=new int[n+1];
        for(int i=0; i<=n; i++){
            int val=i;
            int ct=0;
            for(int j=0; j<=31; j++){
                if((val&1<<j)!=0) ct++;
            }
            count[i]=ct;
            
        }
        return count;
    }
}