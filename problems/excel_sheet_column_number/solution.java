class Solution {
    public int titleToNumber(String c) {
    int sum=0,len=c.length();
    
    for(int i=0; i<len; i++){
       sum=(sum*26)+(c.charAt(i)-'A'+1);
        // System.out.println(sum);
    }
        return sum;
    }
}