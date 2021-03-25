class Solution {
    public String removeDuplicates(String S) {
//      Stack<Character> stack=new Stack<>();
//             for(int i=S.length()-1; i>=0; i--){
//                 char c=S.charAt(i);
//                 if(!stack.isEmpty() && stack.peek()==c) stack.pop();
//                 else stack.push(c);
               
//             }
//         StringBuilder str=new StringBuilder();
//         while(!stack.isEmpty()){
//             str.append(stack.pop());
//         }
//         return str.toString();
        StringBuilder stack=new StringBuilder();
            for(char c:S.toCharArray()){
                int len=stack.length();
                if(len>0 && stack.charAt(len-1)==c) stack.deleteCharAt(len-1);
                else stack.append(c);
               
            }
        return stack.toString();
    }
}