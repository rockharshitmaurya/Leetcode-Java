class Solution {
    public long[] kthPalindrome(int[] queries, int intLength) {
        int pow=intLength%2==0?(intLength/2)-1:intLength/2;
        long start=(long)Math.pow(10,pow);
        long ans[]=new long[queries.length];
        int i=0;
        for(int num:queries){
           StringBuilder st=new StringBuilder((start+num-1)+"");
            StringBuilder rev=new StringBuilder(st).reverse();
            // System.out.println(st+" "+rev);
            if(intLength%2==0){
                st.append(rev);
            }else{
                st.append(rev.substring(1));
            }
            if(st.length()==intLength) ans[i++]=Long.parseLong(st.toString());
            else ans[i++]=-1;
            
        }
     return ans;   
    }
}