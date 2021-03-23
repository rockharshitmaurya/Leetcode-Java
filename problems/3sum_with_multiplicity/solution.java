class Solution {
    public int threeSumMulti(int[] arr, int target) {
       //  Set<Integer> set= new HashSet<>();
       // // for(int i:arr) set.add(i);
       //  int count=0;
       //  for(int i=1; i<arr.length; i++){
       //      int temp=target-arr[i]-arr[i-1];
       //      if(set.contains(temp)) count++;
       //      set.add(arr[i]);
       //      set.add(arr[i-1]);
       //  }
        int count=0;
        int mod = 1000000007;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0; i<arr.length; i++){
            count=(count+map.getOrDefault(target-arr[i],0))%mod;
            for(int j=0; j<i; j++){
                int temp=arr[i]+arr[j];
                map.put(temp,map.getOrDefault(temp,0)+1);
            }
        }
        return count;
    }
}