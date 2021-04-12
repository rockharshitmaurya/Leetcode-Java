class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] arr) {
        Stack<Integer> stack = new Stack<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=arr.length;
        int arr2[]=new int[nums1.length];
        stack.push(n-1);
        // arr2[n-1]=-1;
        for(int i=n-2; i>=0; i--){
            while(stack.size()>0 && arr[i]>=arr[stack.peek()]){
                stack.pop();
            }
            map.put(arr[i],stack.isEmpty()?-1:arr[stack.peek()]);
            // arr2[i]=stack.isEmpty()?-1:arr[stack.peek()];
            stack.push(i);
        }
        int idx=0;
        for(int num:nums1){
           arr2[idx++]=map.getOrDefault(num,-1); 
        }
         // System.out.println(map);
        return arr2;
    }
}