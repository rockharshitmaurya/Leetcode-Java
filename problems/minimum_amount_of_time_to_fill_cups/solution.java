class Solution {
    public int fillCups(int[] am) {
        Arrays.sort(am);
        if(am[0]+am[1]<=am[2]){
            return am[2];
        }else{
            int sm=am[0]+am[1]+am[2];
            if(sm%2==0) return sm/2;
            else return (sm/2)+1;
        }
    }
}