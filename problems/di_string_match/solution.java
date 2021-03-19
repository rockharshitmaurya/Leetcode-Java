class Solution {
    public int[] diStringMatch(String S) {
        int arr[]=new int[S.length()+1];
        int i=0,len=S.length(),D=0;
        for(char c:S.toCharArray()){
            if(c=='I')
              arr[i++]=D++;
                else
                  arr[i++]=len--;  
        }
        arr[S.length()]=D;
        return arr;
        // int n = S.length(), left = 0, right = n;
        // int[] res = new int[n + 1];
        // for (int i = 0; i < n; ++i)
        //     res[i] = S.charAt(i) == 'I' ? left++ : right--;
        // res[n] = left;
        // return res;
    }
}