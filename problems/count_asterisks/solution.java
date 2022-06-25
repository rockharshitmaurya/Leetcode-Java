class Solution {
    public int countAsterisks(String s) {
        String str[]=s.split("\\|");
        int count=0;
        for(int i=0; i<str.length; i+=2){
            // System.out.print(str[i]+"->");
            for(char c:str[i].toCharArray()){
                if(c=='*') count++;
            }
        }
        return count;
    }
}