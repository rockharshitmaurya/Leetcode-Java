class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> list=new ArrayList<>();
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums1) set.add(num);
        
        for(int num:nums2){
            if(set.contains(num)) set.remove(num);
        }
        ArrayList<Integer> toadd=new ArrayList<>(2);
        List<Integer> st = new ArrayList<>(set);
        for(int num:st) toadd.add(num);
        // while(toadd.size()>2) toadd.remove(toadd.size()-1);
        list.add(toadd);
        set=new HashSet<>();
        for(int num:nums2) set.add(num);
        
        for(int num:nums1){
            if(set.contains(num)) set.remove(num);
        }
        toadd=new ArrayList<>(2);
        st = new ArrayList<>(set);
        System.out.println(st);
        for(int num:st) toadd.add(num);
        // while(toadd.size()>2) toadd.remove(toadd.size()-1);
        list.add(toadd);
        return list;
    }
}