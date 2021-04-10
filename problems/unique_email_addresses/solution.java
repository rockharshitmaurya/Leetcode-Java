class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> set=new HashSet<>();
       for(String str:emails){
        String res="";
           res=str.replace(".","");
           String last=str.substring(str.indexOf("@"));
        if(res.contains("+")){
            res=res.substring(0,res.indexOf("+"))+last;
        }else{
            res=res.substring(0,res.indexOf("@"))+last;
        }
           set.add(res);
        }
        System.out.println(set);
        return set.size();
    }
}