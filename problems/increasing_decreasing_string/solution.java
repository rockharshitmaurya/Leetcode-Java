class Solution {
    public String sortString(String s) {
      int len=s.length();
        int freq[]=new int[26];
        for(int  idx=0; idx<len; idx++){
            freq[s.charAt(idx)-'a']++;
        }
        StringBuilder str=new StringBuilder(len);
        int count=0;
        while(count<len){
            for(int i=0; i<26; i++){
                if(freq[i]>0){
                    str.append((char)(i+'a'));
                    freq[i]--;
                    count++;
                }
            }
            for(int i=25; i>=0; i--){
                if(freq[i]>0){
                    str.append((char)(i+'a'));
                    freq[i]=freq[i]-1;
                    count++;
                }
            }
        }
        return str.toString();
    }
}