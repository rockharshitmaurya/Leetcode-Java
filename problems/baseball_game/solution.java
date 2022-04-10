class Solution {
    public int calPoints(String[] ops) {
       Stack<String> st=new Stack<>();
         int ans=0;
        for(String str:ops){
            if(str.equals("+")){
                int num1=Integer.parseInt(st.pop());
                int num2=Integer.parseInt(st.pop());
                st.push(String.valueOf(num2));
                 st.push(String.valueOf(num1));
                 st.push(String.valueOf(num1+num2));
                ans+=(num1+num2);
            }else if(str.equals("C")){
                ans-=Integer.parseInt(st.pop());
            }else if(str.equals("D")){
                int num1=Integer.parseInt(st.pop());
                st.push(String.valueOf(num1));
                 st.push(String.valueOf(num1*2));
                ans+=(num1*2);
            }else{
                st.push(str);
                ans+=Integer.parseInt(str);
            }
        }
       
        return ans;
    }
}