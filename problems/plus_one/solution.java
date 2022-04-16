class Solution {
    public int[] plusOne(int[] digits) {
     ArrayList<Integer> list=new ArrayList<>();
        for(int num:digits){
            list.add(num);
        }
        int rest=1;
        for(int i=list.size()-1; i>=0; i--){
            int num=list.get(i);
            num=num+rest;
            rest=num>9?1:0;
            list.set(i,rest==1?0:num);
        }
        if(rest>0) list.add(0,1);
        int ans[]=new int[list.size()];
        for(int i=0; i<list.size(); i++) ans[i]=list.get(i);
        return ans;
    }
}