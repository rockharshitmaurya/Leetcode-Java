class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int n=nums.length;
        int elen=n%2!=0?((n/2)+1):(n/2);
        int olen=n/2;
        int even[]=new int[elen];
        int odd[]=new int[olen];
        int a=0;
        for(int i=0; i<n; i+=2){
            even[a++]=nums[i];
        }
        a=0;
        for(int i=1; i<n; i+=2){
            odd[a++]=nums[i];
        }
        Arrays.sort(even);
        Arrays.sort(odd);
//         // System.out.println(Arrays.toString(even)+" "+Arrays.toString(odd));
        a=0;

        for(int i=0; i<n; i+=2){
           nums[i]=even[a++]; 
        }
        a=olen-1;
        for(int i=1; i<n; i+=2){
            nums[i]=odd[a--];
        }
        return nums;

    }
}