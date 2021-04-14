class Solution {
    public String reformatNumber(String number) {
     StringBuilder str=new StringBuilder();
        number=number.replace(" ","");
        number=number.replace("-","");
        int len=number.length();
        for(int i=0; i<len; i++){
           int left=(len-i);
            // System.out.println(number+" i : "+i+" and left : "+left);
            if(left<=4){
                if(left==2){
                     str.append(number.substring(i,i+2));
                     i+=2;
                }else if(left==4){
                   str.append(number.substring(i,i+2));
                     i+=2;
                    str.append("-");
                     str.append(number.substring(i,i+2));
                     i+=2;
                }else if(left==3){
                    str.append(number.substring(i,i+3));
                  i+=3;
                }
           }else{
                 str.append(number.substring(i,i+3));
                  i+=3;
        }
            if(i<len) str.append("-");
            i--;
        }
        return str.toString();
    }
}