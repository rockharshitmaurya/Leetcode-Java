class Solution {
    public int numSteps(String s) {
      s="0"+s;
        char[] ca=s.toCharArray();
        int len=ca.length;
        int count=0;
        boolean flag=true;
        while(flag){
            if(ca[len-1]=='1'){
                int k=len-2;
                while(k>0 && ca[k]=='0') k--;
                if(k==0 && ca[k]=='0') return count;
                k=len-1;
                while(k>0 && ca[k]=='1'){
                    ca[k]='0';
                    k--;
                }
                ca[k]='1';
                count++;
            }else{
                int k=len-1;
                while(k>0){
                    ca[k]=ca[k-1];
                    k--;
                }
                ca[k]='0';
                count++;
            }
        }
        return count;
    }
}