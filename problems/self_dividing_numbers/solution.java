class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
       List<Integer> list=new ArrayList<Integer>();
        for(int i=left; i<=right; i++){
             if(isDivide(i)) list.add(i);          
        }
        return list;
    }
    boolean isDivide(int x){
        int temp=x;
          while(temp>0){
              int rem=temp%10;
                if(rem==0 || x%rem!=0) return false;
                     temp=temp/10;
        }
        return true;
    }
}