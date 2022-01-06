class Solution {
    public boolean asteroidsDestroyed(int mass, int[] ast) {
       long m=mass;
        Arrays.sort(ast);
        for(int a:ast){
            if(a>m){
                return false;
            }
            m+=a;
        }
        return true;
    }
}