class Solution {
    public List<String> removeAnagrams(String[] words) {
            ArrayList<String> list=new ArrayList<>();
            Stack<String> st=new Stack<>();
            for(String word: words){
                char ch[]=word.toCharArray();
                Arrays.sort(ch);
                String add=new String(ch);
                if(st.size()>0 && st.peek().equals(add)){
                    
                }else{
                    list.add(word);
                    st.push(add);
                }
            }

        return list;
    }
}