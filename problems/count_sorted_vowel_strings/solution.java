class Solution {
    int count=0;
    public int countVowelStrings(int n) {
       // backtrack(n,0);
        return (n+1)*(n+2)*(n+3)*(n+4)/24;
    }
    void backtrack(int n,int idx){
        if(n==0){
            count++;
            return;
        }
        for(int i=idx; i<5; i++){
            backtrack(n-1,i);
        }
    }
}
// 35-70-