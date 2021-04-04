class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        TreeMap<Integer,Integer> map=new TreeMap<>();
        for(int num:arr1) map.put(num,map.getOrDefault(num,0)+1);
        int j=0;
        for(int num:arr2){
           if(map.containsKey(num)){
               for(int i=0; i<map.get(num); i++){
                   arr1[j++]=num;
               }
               map.remove(num);
           } 
        }
       // System.out.println(map);
        for(int num:map.keySet()) {
            for(int i=0; i<map.get(num); i++){
                   arr1[j++]=num;
              }
        }
        return arr1;
        // int[] cnt = new int[1001];
        // for(int n : arr1) cnt[n]++;
        // int i = 0;
        // for(int n : arr2) {
        //     while(cnt[n]-- > 0) {
        //         arr1[i++] = n;
        //     }
        // }
        // for(int n = 0; n < cnt.length; n++) {
        //     while(cnt[n]-- > 0) {
        //         arr1[i++] = n;
        //     }
        // }
        // return arr1;
    }
}