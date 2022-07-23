class Solution {
private int maxN = (int) 2e4 + 9;
    private int[] bit = new int[maxN];
    private int offset = (int) 1e4 + 1;
    private int low_bit(int x) {
        return x & -x;
    }
    
    private void edit(int ind, int delta) {
        for (int i = ind; i < maxN; i += low_bit(i)) {
            bit[i] += delta;
        }
    }
    
    private int query(int ind) {
        int result = 0;
        for (int i = ind; i > 0; i -= low_bit(i)) {
            result += bit[i];
        }
        
        return result;
    }
    
    public List<Integer> countSmaller(int[] nums) {
        int n = nums.length;
        Integer[] answer = new Integer[n];
        
        for (int i = n - 1; i >= 0; i--) {
            edit(nums[i] + offset, 1);
            answer[i] = query(nums[i] + offset - 1);
        }
        
        return Arrays.asList(answer);
    }
}