class Solution {
    public String truncateSentence(String s1, int k) {
       String[] str=s1.split(" ");
        StringBuilder s=new StringBuilder();
        for(int i=0; i<k; i++){
            s.append(str[i]+" ");
        }
        return s.toString().trim();
    }
}