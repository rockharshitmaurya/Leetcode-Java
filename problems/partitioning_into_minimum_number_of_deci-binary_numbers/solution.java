class Solution {
    public int minPartitions(String n) {
     // int res=0;
     //    for(int i=0; i<n.length(); i++)
     //        res=Math.max(res,n.charAt(i)-'0');
     //    return res;
    for(int i=9;i>=0;i--){
            if(n.contains(String.valueOf(i))){
                return i;
            }
        }
        return 0;
    }
}