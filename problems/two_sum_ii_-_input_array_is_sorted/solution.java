class Solution {
    public int[] twoSum(int[] numbers, int target) {
     HashMap<Integer,Integer> map=new HashMap<>();
     for(int i=0; i<numbers.length; i++){
         int num=target-numbers[i];
         if(map.containsKey(num)){
             return new int[]{map.get(num)+1,i+1};
         }
         map.put(numbers[i],i);         
     }
     return numbers;   
    }
}