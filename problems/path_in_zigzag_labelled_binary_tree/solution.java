class Solution {
   
    public List<Integer> pathInZigZagTree(int label) {
         ArrayList<Integer> list=new ArrayList<>();
        int label_count=1,level=1;
        while(label>=label_count*2){
            label_count*=2;
            level++;
        }
        while(label!=0){
            list.add(0,label);
            int max=((int)Math.pow(2,level))-1;
            int min=(int)Math.pow(2,level-1);
            label=(max+min-label)/2;
            level--;
        }
        // System.out.println(level);
        return list;  
    }

}