class Solution {
    public int maxProduct(String[] words) {
       // Arrays.sort(words);
        int ans=0,n=words.length;
        for(int i=n-1; i>=0; i--){
            HashSet<Character> set=addSet(words[i]);
            label:
            for(int j=i-1; j>=0; j--){
                for(Character ch:words[j].toCharArray()){
                    if(set.contains(ch)){
                       continue label; 
                    }
                }
                ans=Math.max(ans,(words[i].length()*words[j].length()));
            }
        }
       return ans; 
    }
    HashSet<Character> addSet(String str){
        HashSet<Character> set=new HashSet<Character>();
        for(Character ch:str.toCharArray()){
            set.add(ch);
        }
        return set;
    }
}