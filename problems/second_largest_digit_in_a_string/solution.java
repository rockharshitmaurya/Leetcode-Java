class Solution {
    public int secondHighest(String s) {
       int arr[]=new int[10];
        for(char c:s.toCharArray()){
            if(c>='0' && c<='9'){
                arr[c-'0']++;
            }
        }
        System.out.println(Arrays.toString(arr));
        int num=0;
        for(int i=9; i>=0; i--){
            if(arr[i]>0){
                if(++num==2) return i;
            }
        }
        return -1;
    }
}