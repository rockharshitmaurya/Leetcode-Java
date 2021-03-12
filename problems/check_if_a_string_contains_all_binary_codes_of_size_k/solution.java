class Solution {
    public boolean hasAllCodes(String s, int k) {       
		// Set<String> set = new HashSet<>();
		// if(s.length() < k) return false;
		// for(int i=0;i<=s.length()-k;i++){
		// set.add(s.substring(i,i+k));	   
		// }
		// return set.size() == Math.pow(2, k);
        Set<String> seen = new HashSet<>();
        for (int i = k; i <= s.length() && seen.size() < 1 << k; ++i) {
            seen.add(s.substring(i - k, i));
        }
        return seen.size() == 1 << k;
    }
}