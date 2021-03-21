class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        int[] count=new int[1001];
        for(int i:target)
            count[i]++;
        for(int i:arr)
            count[i]--;
        for(int i:count) if(i!=0) return false;
        return true;
    }
}