class Solution {
    int count=0;
    public int heightChecker(int[] h) {
        int[] copy = h.clone();
        Arrays.sort(copy);
        int count = 0;
        for(int i = 0; i < copy.length; i++){
            if(h[i]!=copy[i])count++;
        }
        return count;
    }
 }