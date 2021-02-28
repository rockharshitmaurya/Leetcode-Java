class Solution {
    public int numberOfMatches(int n) {
        if(n==1) return 0;
        int count=0;
        while(n>1){
        int k=(n%2==0)?n/2:(n-1)/2;
            n-=k;
          //  System.out.println(k);
        count+=k;
            
        }
        return count;
    }
}