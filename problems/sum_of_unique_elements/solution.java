class Solution {
    public int sumOfUnique(int[] nums) {
      int arr[]=new int[101];
        int sum=0;
        for(int i:nums)
            arr[i]++;
        for(int i:nums)
            if(arr[i]==1) sum+=i;
        
        return sum;
    }
}