class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int ans[][]=new int[mat.length][2];
        int idx=0;
        for(int arr[]:mat){
            int count=0;
            for(int i:arr)
                if(i==1) count++;
            ans[idx][0]=idx;
            ans[idx++][1]=count;
        }
        int ret[]=new int[k];
        Arrays.sort(ans, (a, b) -> a[1] - b[1]);
        for(int i=0; i<k; i++)
            ret[i]=ans[i][0];
        return ret;
    }
}