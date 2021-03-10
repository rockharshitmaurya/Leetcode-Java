class Solution {
    public boolean halvesAreAlike(String s) {
      // String str="aeiouAEIOU";
      //   int count=0,len=s.length();
      //   for(int i=0; i*2<len; i++){
      //       if(str.contains(s.charAt(i)+"")) count++;
      //       if(str.contains(s.charAt(len-i-1)+"")) count--;
      //   }
      //   //System.out.println(count);
      //   return count==0;
        
        var vowels = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        int a = 0,len=s.length();
        for (int i = 0; i*2<len; i++) {
            a += vowels.contains(s.charAt(i)) ? 1 : 0;
            a -= vowels.contains(s.charAt(len-i-1)) ? 1 : 0;
        }
        return a == 0;
    }
}