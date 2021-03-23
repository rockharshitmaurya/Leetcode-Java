class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> freq=new HashMap<>();
        HashSet<Integer> set=new HashSet<>();
        for(int i:arr)
			if(freq.get(i)==null)
				freq.put(i,1);
			else
				freq.put(i,freq.get(i)+1);
        for(int i:freq.values())
            set.add(i);
        return set.size()==freq.size();
    }
}