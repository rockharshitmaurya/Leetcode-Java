class Solution {
    public int evalRPN(String[] tokens) {
       Stack<Integer> stack=new Stack<>();
        for(String str:tokens){
            int n1=0,n2=0;
            if(str.equals("+")){
                n1=stack.pop();
                n2=stack.pop();
                int res=n2+n1;
                stack.push(res);
            }else if(str.equals("-")){
                n1=stack.pop();
                n2=stack.pop();
                int res=n2-n1;
                stack.push(res);
            }else if(str.equals("*")){
                n1=stack.pop();
                n2=stack.pop();
                int res=n2*n1;
                stack.push(res);
            }else if(str.equals("/")){
                n1=stack.pop();
                n2=stack.pop();
                int res=n2/n1;
                stack.push(res);
            }else{
                stack.push(Integer.parseInt(str));
            }
        }
        return stack.peek();
    }
}