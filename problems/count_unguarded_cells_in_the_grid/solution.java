class Solution {
    // public static final int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    public int countUnguarded(int m, int n, int[][] gu, int[][] wal) {
        int area[][]=new int[m][n];
        for(int arr[]:gu){
            area[arr[0]][arr[1]]=1;
        }
        for(int arr[]:wal){
            area[arr[0]][arr[1]]=-1;
        }
        for(int arr[]:gu){
            int x=arr[0],y=arr[1];
                //right
                for(int i=y+1; i<n; i++){
                    if(area[x][i]==1 || area[x][i]==-1) break;
                    else area[x][i]=2;
                }
               //left
                for(int i=y-1; i>=0; i--){
                    if(area[x][i]==1 || area[x][i]==-1) break;
                    else area[x][i]=2;
                }
              //down
                for(int i=x+1; i<m; i++){
                    if(area[i][y]==1 || area[i][y]==-1) break;
                    else area[i][y]=2;
                }
             //up
               for(int i=x-1; i>=0; i--){
                    if(area[i][y]==1 || area[i][y]==-1) break;
                    else area[i][y]=2;
                }
                
        }
        int count=0;
        for(int arr[]:area){
            for(int num:arr) if(num==0) count++;
        }
        // System.out.println(Arrays.deepToString(area));
        return count;
    }
}