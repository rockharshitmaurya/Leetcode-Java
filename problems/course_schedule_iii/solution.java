class Solution {
    public int scheduleCourse(int[][] cou) {
        Arrays.sort(cou,(o1,o2)->(o1[1]-o2[1]));
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>((o1,o2)->(o2-o1));
        int time=0;
        for(int arr[]:cou){
           time+=arr[0];
           pq.add(arr[0]);
           if(time>arr[1]) time-=pq.poll();
        }
      return pq.size();  
    }
}