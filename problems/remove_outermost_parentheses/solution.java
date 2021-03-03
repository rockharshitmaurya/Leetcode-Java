class Solution {
    public String removeOuterParentheses(String S) {
//        StringBuilder str=new StringBuilder();
//         for(int i=0; i<S.length()-1; i++){
//             if(S.charAt(i)=='(' && S.charAt(i+1)=='('){
//                 str.append(S.charAt(i++));
//             }else if(S.charAt(i)=='('){
//                 str.append(S.charAt(i));
//             }
//              if(S.charAt(i)==')' && S.charAt(i+1)==')'){
//                 str.append(S.charAt(i++));
//             }else if(S.charAt(i)==')'){
//                 str.append(S.charAt(i));
//             }

//         }
//         return str.toString();
        StringBuilder s = new StringBuilder();
        int opened = 0;
        for (char c : S.toCharArray()) {
            if (c == '(' && opened++ > 0) s.append(c);
            if (c == ')' && opened-- > 1) s.append(c);
        }
        return s.toString();
    }
}