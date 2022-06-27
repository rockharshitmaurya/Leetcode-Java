class Solution {
    public int minPartitions(String n) {
        int min=0;
        for(int i=0; i<n.length(); i++) min=Math.max(min,n.charAt(i)-'0');
        return min;
    }
}
// 82734
// 11111
// 71623
// 11111
// 60512
// 11111
// 49401
// 11111
// 38290
// 11111
