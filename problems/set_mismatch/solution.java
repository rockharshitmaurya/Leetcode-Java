class Solution {
    public int[] findErrorNums(int[] nums) {
        int arr[]=new int[2];
        int res=0,totle=0,sum=nums.length,val=0;
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
         for(int n:nums){
             val=(map.getOrDefault(n,0)+1);
             map.put(n,val);
             res+=n;
            if(val==2){
               arr[0]=n;   
             }
         }
       
        arr[1]=(((sum*sum)+sum)/2)-(res-arr[0]);
       //System.out.println(list+" "+sum);
        return arr;
        
        // int[] count = new int[nums.length];
        // int[] result = new int[2];
        // for (int num : nums) {
        //     count[num - 1]++;
        // }
        // for (int i = 0; i < nums.length; i++) {
        //     if (count[i] == 2) {
        //         result[0] = i + 1;
        //     }
        //     if (count[i] == 0) {
        //         result[1] = i + 1;
        //     }
        // }
        // return result;
    }
}