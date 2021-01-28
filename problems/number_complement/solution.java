class Solution {
    public int findComplement(int num) {
        // System.out.println(Integer.highestOneBit(num));
        // int mask = (Integer.highestOneBit(num) << 1) - 1;
        // return num ^ mask;
    return  ~num & ((Integer.highestOneBit(num) << 1) - 1);
    }
}