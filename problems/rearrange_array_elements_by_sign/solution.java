class Solution {
    public int[] rearrangeArray(int[] nums) {
       ArrayList<Integer> pos=new ArrayList<>();
        ArrayList<Integer> neg=new ArrayList<>();
        
        int res[]=new int[nums.length];
        for(int e:nums){
            if(e>=0) pos.add(e);
            else neg.add(e);
        }
        for(int i=0,idx=0; i<pos.size(); i++){
            res[idx++]=pos.get(i);
            res[idx++]=neg.get(i);
        }
        // System.out.println(pos+" "+neg);
        return res;
        
    }
}