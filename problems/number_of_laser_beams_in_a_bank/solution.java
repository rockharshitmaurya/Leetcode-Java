class Solution {
    public int numberOfBeams(String[] bank) {
      int len=bank.length,sum=0,prev=0;
    for(int i=0; i<len; i++){
        int count=0;
        for(Character c:bank[i].toCharArray()){
            if(c=='1'){
                count+=1;
            }
      }
     sum+=(prev*count);   
        if(count!=0)
        prev=count;

    }

        
        // System.out.println(Arrays.toString(arr));
        return sum;
    }
}