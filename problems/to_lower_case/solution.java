class Solution {
    public String toLowerCase(String s) {
       StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray()){
            if(c<'a' && c>='A'){
                int diff=c-'A';
                diff+='a';
                char ch=(char)diff;
                // System.out.println(ch);
                sb.append(ch);
            }else{
                sb.append(c);
            }
        }
        return sb+"";
    }
}