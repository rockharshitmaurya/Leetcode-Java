class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans=new ArrayList<>();
        helper(s,0,ans,new ArrayList<String>());
        return ans;
    }
    void helper(String s,int idx,List<List<String>> ans,ArrayList<String> ds){
        if(idx==s.length()){
            ans.add(new ArrayList<>(ds));
            return;
        } 
        for(int i=idx; i<s.length(); i++){
            if(isPalindrom(s,idx,i)){
                ds.add(s.substring(idx,i+1));
                helper(s,i+1,ans,ds);
                ds.remove(ds.size()-1);
            }
        }
    }
    boolean isPalindrom(String str,int l,int r){
        while(l<=r){
            if(str.charAt(l++)!=str.charAt(r--)) return false;
        }
        return true;
    }
}