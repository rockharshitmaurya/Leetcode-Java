class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        int len=deck.length;
        int res[]=new int[len];
        Arrays.sort(deck);
        Queue<Integer> q=new LinkedList<Integer>();
        for(int i=0; i<len; i++) q.add(i);
        for(int i=0; i<len; i++){
             res[q.poll()]=deck[i];
            q.add(q.poll());
        }
        return res;
    }
}
//