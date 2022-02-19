class Solution {
    public List<Long> maximumEvenSplit(long sum) {
        if(sum%2!=0) return new ArrayList<Long>();
        LinkedList<Long> list = new LinkedList<>();
        long mul=2;
        while(mul<=sum){
            list.offer(mul);
            sum-=mul;
            mul+=2;
        }
        list.add(sum+list.pollLast());
        return list;
    }
}