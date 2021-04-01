class Solution {
    public int minDeletionSize(String[] strs) {
       int count=0;
        for(int i=0; i<strs[0].length(); i++){
             int c=strs[0].charAt(i);
            for(int j=0; j<strs.length; j++){
                if(((int)strs[j].charAt(i))<c){
                    count++;
                    break;
                }else{
                  c=strs[j].charAt(i);  
                }
            }
        }
        return count;
    }
}