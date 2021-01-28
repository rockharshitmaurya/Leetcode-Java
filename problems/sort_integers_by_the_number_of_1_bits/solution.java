class Solution {
    public int[] sortByBits(int[] arr) {
    ArrayList<Integer> temp=new ArrayList<Integer>();
      for(int j:arr) temp.add(j);
                Collections.sort(temp,(o1,o2)->{
                int a=Integer.bitCount(o1);
                int b=Integer.bitCount(o2);
                if(a!=b) return a-b;
                
                return o1-o2;
            });
        for(int i=0; i<arr.length; i++){
        arr[i]=temp.get(i);    
        }
        return arr;
    }
}