class Solution {
    int result;
    public int closestCost(int[] baseCosts, int[] toppingCosts, int target) {
        result=baseCosts[0];
        
        for(int base:baseCosts)
            helper(base,toppingCosts,target,0);
        return result;
    }
    
    void helper(int current,int[] topping,int target,int idx){
        if( Math.abs(target - current) < Math.abs(target - result) || Math.abs(target - current) == Math.abs(target - result) && current < result)
            result = current;
        
        if(idx==topping.length || current >= target) return;
        helper(current+topping[idx]*0,topping,target,idx+1);
        helper(current+topping[idx]*1,topping,target,idx+1);
        helper(current+topping[idx]*2,topping,target,idx+1);  
    }
}