class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1=new HashSet<Integer>();
         Set<Integer> set=new HashSet<Integer>();
        for(int i:nums1){
            set1.add(i);
        }
        for(int i:nums2){
            if(set1.contains(i)) set.add(i);
        }
        int len=set.size();
        int arr[]=new int[len];
        int l=0;
        for(int i:set){
            arr[l++]=i;
        }
        return arr;
    }
}
//4-5-9
//4-4-8-9-9