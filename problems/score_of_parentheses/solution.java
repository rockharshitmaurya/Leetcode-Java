class Solution {
    public int scoreOfParentheses(String S) {
     // Stack<Character> stack=new Stack<Character>();
     //    int count=0;
     //    boolean flag=true,flag2=false;
     //    for(char c:S.toCharArray()){
     //        flag=true;
     //        if(!stack.isEmpty() && stack.peek()=='(' && c==')'){
     //            stack.pop();
     //            if((stack.size()!=0)){
     //                count+=2;
     //                flag2=true;
     //            }else{
     //                count+=flag2?0:1;
     //                flag2=false;
     //            }
     //            flag=false;
     //        }
     //        if(flag){
     //            stack.push(c);
     //          }
     //        System.out.println(stack+" "+count);
     //    }
     //    System.out.println(stack);
     //    return count;
        Stack<Integer> stack = new Stack<>();
        int cur = 0;
        for (char c : S.toCharArray()) {
            if (c == '(') {
                stack.push(cur);
                cur = 0;
            } else {
                cur = stack.pop() + Math.max(cur * 2, 1);
            }
        }
        return cur;
    }
}