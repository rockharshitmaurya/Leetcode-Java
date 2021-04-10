class Solution {
    public String toGoatLatin(String S) {
      StringBuilder res=new StringBuilder();
        String e="maa";
        for(String str1:S.split(" ")){
            StringBuilder str=new StringBuilder(str1);
            if(isVowel(str.charAt(0))){
                res.append(str+e+" ");
                e=e+"a";
                
            }else{
                res.append(str.substring(1)+str.charAt(0)+e+" ");
                e=e+"a";
            }          
      }
        return res.toString().trim();
    }
    boolean isVowel(char c){
        switch (c) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                return true;
        }
        return false;
    }
}