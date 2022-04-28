class Solution {
    public static final int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    public int minimumEffortPath(int[][] heights) {
        PriorityQueue<int[]> pq=new PriorityQueue<>((o1,o2)->(o1[2]-o2[2]));
        int n=heights.length;
        int m=heights[0].length;
        Integer[][] minDist=new Integer[n][m];
        pq.offer(new int[]{0,0,0});
        minDist[0][0]=0;
        while(!pq.isEmpty()){
            int cur[]=pq.poll();
            if(cur[0]==n-1 && cur[1]==m-1) return cur[2];
            for(int dir[]:dirs){
             int nx=cur[0]+dir[0];
             int ny=cur[1]+dir[1];
             if(nx<0 || nx>=n || ny<0 || ny>=m) continue;
             int effort=Math.max(cur[2],Math.abs(heights[cur[0]][cur[1]]-heights[nx][ny]));
             if(minDist[nx][ny]==null || minDist[nx][ny]>effort){
                minDist[nx][ny]=effort;
                 pq.offer(new int[]{nx,ny,effort});
             }   
            }
        }
        return -1;
    }
}