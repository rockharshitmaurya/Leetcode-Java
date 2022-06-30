class Solution {
    String res="";
    int count=0;
    public String getHappyString(int n, int k) {
        char ch[]={'a','b','c'};
        helper(ch,-1,"",n,k);
        return res;
    }
    void helper(char ch[],int idx,String ans,int n, int k){
        if(ans.length()==n){
            count++;
            if(count==k) res=ans;
            return;
        }
        for(int i=0; i<3; i++){
            if(i==idx) continue;
            ans+=ch[i];
            helper(ch,i,ans,n,k);
            ans=ans.substring(0,ans.length()-1);
        }
    }
}