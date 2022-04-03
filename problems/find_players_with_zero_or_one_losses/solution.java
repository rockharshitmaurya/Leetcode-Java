class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        HashMap<Integer,Integer> winner=new HashMap<>();
        HashMap<Integer,Integer> loser=new HashMap<>();
        for(int arr[]:matches){
            winner.put(arr[0],winner.getOrDefault(arr[0],0)+1);
            loser.put(arr[1],loser.getOrDefault(arr[1],0)+1);
        }
        ArrayList<Integer> not_lost=new ArrayList<Integer>();
        ArrayList<Integer> lost_one=new ArrayList<Integer>();
        for(int key:winner.keySet()){
            if(loser.get(key)==null) not_lost.add(key);
            
        }
        for(int key:loser.keySet()){
            if(loser.get(key)==1) lost_one.add(key);
        }
        Collections.sort(not_lost);
        Collections.sort(lost_one);
        // System.out.println(not_lost);
        // System.out.println(lost_one);
        ArrayList<List<Integer>> list=new ArrayList<>();
        list.add(not_lost);
        list.add(lost_one);
        return list;
    }
}