class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
    // int count=0;
    // Set<Character> allowedLetters = new HashSet<>();
    // for(char letter : allowed.toCharArray()) allowedLetters.add(letter);
    //     for(String str:words){
    //         for(int i=0; i<str.length(); i++){
    //             if(!allowedLetters.contains(str.charAt(i))) break;
    //             if(i==str.length()-1) count++;
    //         }
    //     }
    //     return count;
         int count = 0;
        Set allow = new HashSet<>();
        for (char ch : allowed.toCharArray()) {
            allow.add(ch);
        }
        for (String word : words) {
            for (char ch : word.toCharArray()) {
                if (!allow.contains(ch)) {
                    count++; 
                    break;
                }
            }
        }
        return words.length - count;
    }
}