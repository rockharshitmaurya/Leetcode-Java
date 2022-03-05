class Solution {
    public int[] sortJumbled(int[] mapping, int[] nums) {
        List<int[]> al = new ArrayList<>();
        for(int n: nums){
            String s = String.valueOf(n);
            StringBuilder sb = new StringBuilder();
            for(char c: s.toCharArray()){
                sb.append(mapping[c-'0']);
            }
            al.add(new int[]{Integer.valueOf(sb.toString()), n});
        }
        Collections.sort(al, (a,b)-> a[0] - b[0]);
        int[] ans = new int[nums.length];
        int idx = 0;
        for(int[] arr : al){
            ans[idx++] = arr[1];
        }
        return ans;
    }
}