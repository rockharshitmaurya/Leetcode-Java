class Edge{
    int point1;
    int point2;
    int cost;
    public Edge(int point1,int point2,int cost){
        this.point1=point1;
        this.point2=point2;
        this.cost=cost;
    }
}
class Solution {
    public int minCostConnectPoints(int[][] points) {
     int n=points.length;
     boolean visited[]=new boolean[n];
     int need=n-1;
     int ans=0;
     PriorityQueue<Edge> pq=new PriorityQueue<Edge>((o1,o2)->(o1.cost-o2.cost));
     int cord1[]=points[0];
     for(int i=1; i<n; i++){
         int cord2[]=points[i];
         int cost=Math.abs(cord2[0]-cord1[0])+Math.abs(cord2[1]-cord1[1]);
         pq.offer(new Edge(0,i,cost));
     }
        visited[0]=true;
        while(!pq.isEmpty() && need>0){
            Edge e=pq.poll();
            int point1=e.point1;
            int point2=e.point2;
            int cost=e.cost;
            // System.out.println(cost+" "+Arrays.toString(visited));
            if(!visited[point2]){
                visited[point2]=true;
                // System.out.println("Inside");
                ans+=cost;
                for(int i=0; i<n; i++){
                    if(!visited[i]){
                      int dist=Math.abs(points[point2][0]-points[i][0])+Math.abs(points[point2][1]-points[i][1]);
                      pq.offer(new Edge(point2,i,dist));
                    }
                }
                need--; 
            }

        }
      return ans;  
    }
}