class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
     List<Boolean> list=new ArrayList<Boolean>();
        int max=0;
        for(int i:candies){
            max=Math.max(max,i);
        }
        for(int j:candies){
           // if((j+extraCandies)>=max){ list.add(true);} else{ list.add(false); }
            list.add(((j+extraCandies)>=max));
        }
        return list;
    }
}