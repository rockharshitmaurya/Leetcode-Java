class Solution {
    public int minimumCardPickup(int[] cards) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int ans=Integer.MAX_VALUE;
        for(int i=0; i<cards.length; i++){
             if(map.containsKey(cards[i])){
                ans=Math.min(ans,((i+1)-map.get(cards[i])+1));
                map.put(cards[i],i+1);
             }else{
                map.put(cards[i],i+1); 
             }
        }
        return ans==Integer.MAX_VALUE?-1:ans;
    }
}