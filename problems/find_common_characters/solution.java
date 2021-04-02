class Solution {
    public List<String> commonChars(String[] A) {
        List<String> list=new ArrayList<>();
        int count[]=new int[26];
        Arrays.fill(count,Integer.MAX_VALUE);
        for(String str:A){
            int temp[]=new int[26];
            str.chars().forEach(c-> ++temp[c-'a']);
            for(int i=0; i<26; i++) count[i]=Math.min(count[i],temp[i]);
        }
        for(int i=0; i<26;  i++){
            while(count[i]-->0) list.add(""+(char)(i+'a'));
        }
        return list;
    }
}