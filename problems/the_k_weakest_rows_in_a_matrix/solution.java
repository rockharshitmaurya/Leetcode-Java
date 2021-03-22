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
//         int min=ans[0][1];
//         int lo=0;
//         while(lo<k){
//             for(int i=ans.length-1; i>=0; i--){
//                 if(i>vis)
//                 ans[i][1]
//             }
                
//            lo++;     
//         }
        Arrays.sort(ans, (a, b) -> a[1] - b[1]);
        for(int i=0; i<k; i++)
            ret[i]=ans[i][0];
        return ret;
    }
}