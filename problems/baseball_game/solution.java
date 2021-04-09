class Solution {
    public int calPoints(String[] ops) {
      int res=0,last=0;
        Stack<Integer> stack=new Stack<Integer>();
        for(String S:ops){
         
                if(S.equals("C")){
                    res-=stack.pop();
                }else if(S.equals("D")){
                    stack.push(stack.peek()*2);
                    res+=stack.peek();
                    
                }else if(S.equals("+")){
                    stack.push(stack.peek()+stack.get(stack.size()-2));
                    res+=stack.peek();
                }else{
                last=Integer.parseInt(S);
                res+=last;
                stack.push(last);
            }
            
        }
        // res=0;
        // while(!stack.isEmpty()){
        //    res+=stack.pop(); 
        // }
        return res;  
    }
}