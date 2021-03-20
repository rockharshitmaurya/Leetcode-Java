class Solution {
    public String reverseWords(String s) {
     String str[]=s.split(" ");
        String res="";
        for(String temp:str){
            res+=new StringBuilder(temp).reverse();
            res+=" ";
        }
        return res.trim();
    }
    
}