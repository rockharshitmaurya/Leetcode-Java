class Solution {
    public int maximum69Number (int num) {
        StringBuilder sb=new StringBuilder();
        String str=num+"";
        boolean flag=true;
        int i=0;
        while(i<str.length()){
            if(str.charAt(i)=='6' && flag){
                sb.append("9");
                  flag=false;
                i++;
                continue;
            }
            sb.append(str.charAt(i++));
        }
            System.out.println(sb.toString());  
            return Integer.parseInt(sb.toString());
    }
}