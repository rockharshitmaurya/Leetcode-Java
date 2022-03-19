class Solution {
    public long maximumSubsequenceCount(String text, String pattern) {
        long two[]=new long[text.length()];
        long a=0,b=0;
        for(int i=text.length()-1; i>=0; i--){
            if(text.charAt(i)==pattern.charAt(1)) b++;
            two[i]=b;

        }
        
        long one_ans=0;
        long two_ans=0;
        for(int i=0; i<text.length(); i++){
            if(text.charAt(i)==pattern.charAt(0)){
                two_ans+=(1*(two[i]+1));
                if(pattern.charAt(0)==pattern.charAt(1)) two_ans--;
            }
        }
        for(int i=0; i<text.length(); i++){
            if(text.charAt(i)==pattern.charAt(0)){
                one_ans+=(1*(two[i]));
                if(pattern.charAt(0)==pattern.charAt(1)) one_ans--;
            }
        }
        for(int i=0; i<text.length(); i++){
            if(two[i]>0){
                one_ans+=(1*two[i]);
                break;
            }
        }
        return Math.max(one_ans,two_ans);
        
    }
}