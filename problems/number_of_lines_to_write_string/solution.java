class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int line=1,sum=0,i=0;
        for(i=0; i<s.length()-1; i++){
            sum+=widths[s.charAt(i)-'a'];
            
            if((sum+widths[s.charAt(i+1)-'a'])>100){
                sum=0;
                line++;
            }
        }
        sum+=widths[s.charAt(i)-'a'];
        return new int[]{line,(sum)};
    }
}