class Solution {
    public String[] spellchecker(String[] wordlist, String[] queries) {
            HashMap<String,String> wordsMap=new HashMap<>();
            HashMap<String,String> wordsPatternMap=new HashMap<>();
        for(String word:wordlist){
            wordsMap.put(word,word);
            String lower = word.toLowerCase(), devowel = lower.replaceAll("[aeiou]", "*");
            wordsPatternMap.putIfAbsent(lower,word);
            wordsPatternMap.putIfAbsent(devowel,word);
        }
        for(int i=0; i<queries.length; i++){
            if(wordsMap.containsKey(queries[i])){
               // queries[i]=wordsMap.get(queries[i]);
                continue;
            }
            String lower = queries[i].toLowerCase();
            if(wordsPatternMap.containsKey(lower)){
                queries[i]=wordsPatternMap.get(lower);
                continue;
            }
            String devowel = lower.replaceAll("[aeiou]", "*");

            if(wordsPatternMap.containsKey(devowel)){
                queries[i]=wordsPatternMap.get(devowel);
                continue;
            }
            queries[i]="";
        }
        return queries;
    }
}