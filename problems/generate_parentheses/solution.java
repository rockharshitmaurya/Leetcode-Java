class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        helper(n,0,0,ans,"");
        return ans;
    }
    void helper(int n,int open,int close,List<String> ans,String str){
        if(str.length()==n*2){
                // System.out.println(str);
            ans.add(str);
            return ;
        }

        if(open<n) 
            helper(n,open+1,close,ans,str+"(");
        if(close<open)
            helper(n,open,close+1,ans,str+")");
        
    }
}