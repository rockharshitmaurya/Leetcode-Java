class Solution {
    public int getMaximumConsecutive(int[] coins) {
        Arrays.sort(coins); //1-1-1-4
			int re = 0;
			for(int c : coins){
	
                if(c <= re + 1){
					re += c;
				}
			}
			return re + 1;
    }
}