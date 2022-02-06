class Solution {
    public long smallestNumber(long num) {
        if(num==0) return (long)0;
        ArrayList<Long> list=new ArrayList<>();
        String ans="";
        long res=0;
        if(num<0){
        num=(long)Math.abs(num);
        while(num>0){
            list.add(num%10);
            num/=10;
        }
            Collections.sort(list, Collections.reverseOrder());
            for(int i=0; i<list.size(); i++){
            ans+=list.get(i);
            }
            res=Long.parseLong(ans);
            res=res*-1;
        }else{
        while(num>0){
            list.add(num%10);
            num/=10;
        }
        Collections.sort(list);
        
        if(list.get(0)==0){
            for(int i=0; i<list.size(); i++){
                if(list.get(i)>0){
                    long temp=list.get(i);
                    list.set(i,(long)0);
                    list.set(0,temp);
                    break;
                }
            }
        }
        for(int i=0; i<list.size(); i++){
          ans+=list.get(i);
        }
        res=Long.parseLong(ans);
        }
         return res;
    }
}