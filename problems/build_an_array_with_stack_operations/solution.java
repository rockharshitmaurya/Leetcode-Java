class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> list=new ArrayList<>();
        int idx=0;
        for(int i=1; i<=target[target.length-1]; i++){
           if(i==target[idx]){
               list.add("Push");
               //if(idx<target.length-1)
               idx++;
           }else{
               list.add("Push");
               list.add("Pop");
           } 
        }
        return list;
    }
}//1 4
