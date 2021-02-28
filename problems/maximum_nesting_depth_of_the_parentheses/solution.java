class Solution {
    public int maxDepth(String s) {
      int max1=0,count=0;
        for(char c:s.toCharArray()){
            if(c=='(') count++;
            max1=Math.max(max1,count);
            if(c==')') count--;
        }
        
        return max1;  
    }
}