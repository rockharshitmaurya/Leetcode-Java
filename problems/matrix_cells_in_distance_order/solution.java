class Solution {
    public int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
        int arr[][]=new int[R*C][2];
        int idx=0;
        for(int i=0; i<R; i++){
            for(int j=0; j<C; j++){
                arr[idx++]=new int[]{i,j};
            }
        }
        Arrays.sort(arr,(o1,o2)->{
           return Math.abs(o1[0]-r0)+Math.abs(o1[1]-c0)-(Math.abs(o2[0]-r0)+Math.abs(o2[1]-c0));
        });
        return arr;        
    }
}