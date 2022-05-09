class Solution {
    public String largestGoodInteger(String num) {
       ArrayList<Integer> list=new ArrayList<>();
        int count=1,idx=0;
        for(int i=0; i<num.length()-1; i++){
            if(num.charAt(i)==num.charAt(i+1)){
                count++;
            }else{
                count=1;
                idx=i+1;
            }
            
            if(count==3){
                // System.out.println(idx+" "+(i+2));
                list.add(Integer.parseInt(num.substring(idx,(i+1+1))));
            }
        }
        Collections.sort(list);
        if(list.size()==0) return "";
        if(list.get(list.size()-1)==0) return "000";
        return list.get(list.size()-1).toString();
    }
}