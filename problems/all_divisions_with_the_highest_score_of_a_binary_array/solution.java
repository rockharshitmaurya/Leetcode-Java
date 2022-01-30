class Solution {
    public List<Integer> maxScoreIndices(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Integer> res=new ArrayList<Integer>();
        int one=0;
        for(int val:nums){
            if(val==1) one++;
        }
            int zero=0,max=Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            list.add(one+zero);
            max=Math.max(max,(one+zero));
            if(nums[i]==1 && one>0) one--;
            if(nums[i]==0) zero++;
            
            
        }
        list.add(zero+one);
        max=Math.max(max,(one+zero));
        for(int a=0; a<list.size(); a++){
            if(list.get(a)==max) res.add(a);
        }
        // System.out.println(res);
        return res;
    }
}