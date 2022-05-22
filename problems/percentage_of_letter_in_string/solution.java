class Solution {
    public int percentageLetter(String s, char l) {
        int count=0;
        for(Character c:s.toCharArray()){
            if(l==c) count++;    
        }
        // count=count/s.length();
        // System.out.println(count*100);
        return (count*100)/s.length();
    }
}