class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];
        int first[]=new int[n-1];
        int last[]=new int[n-1];
        //since we know that the house are arrenged in circulr order there by we know that we can not have first and the last element of the array togather ,so-->
        for(int i=0; i<n; i++){
            if(i!=0) first[i-1]=nums[i]; //once we ignore the first element and copy rest of the element in onther array
            if(i!=n-1) last[i]=nums[i]; // and make one another array in which we add all the element except tha last elemnt of ate array 
        }
        return Math.max(helper(first,n-1),helper(last,n-1)); //now we apply same logic as house robber 1 problm and return the max of them
        
    }
    int helper(int nums[],int n){
        int prev=nums[0];
        int prev2=0;
        for(int i=1; i<n; i++){
            int take=nums[i]+((i>1)?prev2:0);
            int notTake=0+prev;
            int cur=Math.max(take,notTake);
            prev2=prev;
            prev=cur;
        }
        return prev;
    }
}