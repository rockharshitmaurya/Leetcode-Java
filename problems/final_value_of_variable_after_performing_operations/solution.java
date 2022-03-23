class Solution {
    public int finalValueAfterOperations(String[] op) {
        int x=0;
        for(String st:op){
            if(st.equals("++X") || st.equals("X++")) x++;
            else x--;
        }
        return x;
    }
}