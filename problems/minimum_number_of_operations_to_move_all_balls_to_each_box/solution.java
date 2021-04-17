class Solution {
    public int[] minOperations(String boxes) {
        int len=boxes.length();
        int res[]=new int[len];
         int left[]=new int[len];
         int right[]=new int[len];
        int cnt=boxes.charAt(0)-'0';
        for(int i=1; i<len; i++){
            left[i]=left[i-1]+cnt;
            cnt+=boxes.charAt(i)-'0';
        }
        cnt=boxes.charAt(len-1)-'0';
        for(int i=len-2; i>=0; i--){
            right[i]=right[i+1]+cnt;
            cnt+=boxes.charAt(i)-'0';
        }
        for(int i=0; i<len; i++)
            res[i]=left[i]+right[i];
        return res;
    }
}