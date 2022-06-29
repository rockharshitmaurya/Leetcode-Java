class Solution {
    HashMap<Character,Character> map=new HashMap<>();
    public List<String> letterCasePermutation(String s) {
        char ch[]=s.toCharArray();
        List<String> ans=new ArrayList<String>();
        // char a='a',A='A';
        // for(int i=0; i<26; i++){
        //     map.put(a,A);
        //     map.put(A,a);
        //     a++;A++;
        // }
        helper(ch,0,ans);
        return ans;
    }
    void helper(char ch[],int idx,List<String> ans){
            ans.add(new String(ch));
        for(int i=idx; i<ch.length; i++){
            if(Character.isDigit(ch[i])) continue;
            ch[i]=Character.isUpperCase(ch[i])?Character.toLowerCase(ch[i]):Character.toUpperCase(ch[i]);   
            helper(ch,i+1,ans);
            ch[i]=Character.isUpperCase(ch[i])?Character.toLowerCase(ch[i]):Character.toUpperCase(ch[i]);
        }
    }
}