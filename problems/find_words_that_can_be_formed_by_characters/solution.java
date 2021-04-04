class Solution {
    public int countCharacters(String[] words, String chars) {
      int freq[]=freq(chars);
        int count=0;
        for(String str:words){
            if(comp(freq(str),freq,str)){
                count+=str.length();
                //System.out.println(str);
            }
            
        }
        return count;
    }
    int[] freq(String str){
        int arr[]=new int[26];
        for(char c:str.toCharArray())
            arr[c-'a']++;
        return arr;
    }
    boolean comp(int arr[],int freq[],String s){
       for(char c:s.toCharArray()){
           if(arr[c-'a']>freq[c-'a'])return false;
       }
        return true; 
    }
}