class Solution {
    public String generateTheString(int n) {
     // StringBuilder sb=new StringBuilder();
     //    if((n&1)==0){
     //      for(int i=0; i<n-1; i++){
     //          sb.append("a");
     //      }
     //        sb.append("b");
     //    }else{
     //        for(int i=0; i<n; i++){
     //          sb.append("a");
     //      }
     //    }
     //    return sb.toString();
        return "b" + "ab".substring(n % 2, 1 + n % 2).repeat(n - 1);
    }
}