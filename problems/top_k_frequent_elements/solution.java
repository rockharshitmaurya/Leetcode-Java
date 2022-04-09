class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums) map.put(num,map.getOrDefault(num,0)+1);
        PriorityQueue <Map.Entry<Integer,Integer>> l = new PriorityQueue <> (k,(a,b)->Integer.compare(b.getValue(),a.getValue()));
        l.addAll(map.entrySet());
        int ans[]=new int[k];
        while(k-->0){
            ans[k]=l.poll().getKey();
        }
        // for(Map.Entry<Integer,Integer> it:map.entrySet()){
        // int key=it.getKey();
        // int val=it.getValue();
        // q.offer(new Pair(key,val));
        // }
        
        
        return ans;
    }

    
}
    //  class Pair{
    //     int key;
    //     int val;
    //      Pair(int _key,int _val){
    //         key=_key;
    //         val=_val;
    //     }
    // }