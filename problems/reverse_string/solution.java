class Solution {
    static char[] arr;
    public void reverseString(char[] s) {
        arr=s;
        helper(0,s.length-1);
    }
    public static void helper(int idx,int last){
        if(idx>=last) return;
        char c=arr[idx];
        arr[idx]=arr[last];
        arr[last]=c;
        helper(++idx,--last);
        
    }
}