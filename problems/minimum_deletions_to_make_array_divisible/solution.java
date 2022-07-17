class Solution {
    public int minOperations(int[] nums, int[] numsDivide) {
            int n_min=Integer.MAX_VALUE,d_min=Integer.MAX_VALUE;
            PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
            for(int num:nums){
                n_min=Math.min(n_min,num);
                pq.add(num);
                if(n_min==1) return 0;
            }
            d_min=findGCD(numsDivide,numsDivide.length);
            for(int num:numsDivide){
                if(num%d_min!=0) return -1;
            }
            while(!pq.isEmpty()){
                int num=pq.peek();
                if(d_min%num!=0){
                    pq.poll();
                }else{
                    break;
                }
            }
            if(pq.isEmpty()) return -1;
            return nums.length-pq.size();
    }
     int gcd(int a, int b)
	{
		if (a == 0)
			return b;
		return gcd(b % a, a);
	}
	 int findGCD(int arr[], int n)
	{
		int result = arr[0];
		for (int element: arr){
			result = gcd(result, element);

			if(result == 1)
			{
			return 1;
			}
		}

		return result;
	}
}