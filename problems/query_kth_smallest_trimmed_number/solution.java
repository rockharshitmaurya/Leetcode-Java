class Solution {
    public int[] smallestTrimmedNumbers(String[] nums, int[][] queries) {
        int m=nums.length,n=queries.length;
        int ans_idx=0,ans[]=new int[n];
            // Arrays.sort(arr, (a, b)-> (a.val.compareTo(b.val)));
        for(int arr[]:queries){
            PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->(a.val.equals(b.val)?(b.idx-a.idx):(b.val.compareTo(a.val))));
            for(int i=0; i<m; i++){
                String num=nums[i].substring(nums[i].length()-arr[1]);
                pq.add(new Pair(i,num));
                if(pq.size()>arr[0]) pq.poll();
            }
            ans[ans_idx++]=pq.poll().idx;
        }
        return ans;
    }
    class Pair{
        int idx;
        String val;
        public Pair(int idx,String val){
            this.val=val;
            this.idx=idx;
        }
    }
}
// 3 2 1