class Solution {
    public String minimizeResult(String exp) {
        String val[]=exp.split("\\+");
        long ans=Integer.MAX_VALUE;
        String str="";
        for(int i=val[0].length()-1; i>=0; i--){
            for(int j=0; j<val[1].length(); j++){
                int plus1=Integer.parseInt(val[0].substring(i));
                int plus2=Integer.parseInt(val[1].substring(0,j+1));
                int mul1=i>0?Integer.parseInt(val[0].substring(0,i)):1;
                int mul2=(j+1)<val[1].length()?Integer.parseInt(val[1].substring(j+1)):1;
                long temp=mul1*(plus1+plus2)*mul2;
                if(temp<ans){
                    ans=temp;
                    str=val[0].substring(0,i)+"("+val[0].substring(i)+"+"+val[1].substring(0,j+1)+")"+val[1].substring(j+1);
                }
                // System.out.println(val[0].substring(0,i)+"("+val[0].substring(i)+" + "+val[1].substring(0,j+1)+")"+val[1].substring(j+1));
                    // System.out.println("("+val[0].substring(0,i)+" + "+val[1].substring(j+1)+")");
            }
        }
        return str;
    }
}