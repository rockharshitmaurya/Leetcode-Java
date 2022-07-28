class Solution {
    public boolean isAnagram(String s, String t) {
        char s_arr[]=s.toCharArray();
        char t_arr[]=t.toCharArray();
        Arrays.sort(t_arr);
        Arrays.sort(s_arr);
        return Arrays.equals(t_arr,s_arr);
    }
}