class Solution {
    public int oddCells(int n, int m, int[][] a) {
       int arr[][]=new int[n][m];
        // for(int l[]:arr)
        //     Arrays.fill(l,0);
        for(int j=0; j<a.length; j++){
            for(int i=0; i<m; i++){
                arr[a[j][0]][i]++;
            }
            for(int i=0; i<n; i++){
              arr[i][a[j][1]]++;  
            }
            
        }
        int count=0;
        for(int k[]:arr){
            for(int i=0; i<k.length; i++){
                if((k[i]&1)==1) count++;
            }
        }
//        System.out.println(Arrays.toString(arr[1]));
        return count;
    }
}