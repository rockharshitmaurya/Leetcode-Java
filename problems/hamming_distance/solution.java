class Solution {
    public int hammingDistance(int x, int y) {
        
        if(x==y) return 0;
        
        int xor=x^y;
        return noOfOne(xor);
    }
    static int noOfOne(int no){
        if(no<0) return 0;
        int count=0;
        while(no!=0){
            no=no&(no-1);
            count++;
        }
        return count;
    }
}