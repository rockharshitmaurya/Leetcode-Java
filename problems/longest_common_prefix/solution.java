class Solution {
    public String longestCommonPrefix(String[] strs) {
       Arrays.sort(strs);
        String one=strs[0];
        String last=strs[strs.length-1];
        for(int i=0; i<one.length(); i++){
            if(one.charAt(i)!=last.charAt(i)) return one.substring(0,i);
        }
        return one;
    }
}