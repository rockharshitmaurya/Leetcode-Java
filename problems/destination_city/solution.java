class Solution {
    public String destCity(List<List<String>> paths) {
//        int len=paths.size();
//         for(int i=0; i<len; i++){
//            for(int j=0; j<len; j++){
//                if(paths.get(i).get(1).equals(paths.get(j).get(0))){
//                    break;
//                }else if(j==len-1 && !paths.get(i).get(1).equals(paths.get(j).get(0))){
//                   return paths.get(i).get(1);
//                }
               
//            }
//        }
//         return "";
        HashMap<String,String> h = new HashMap<>();
        for(int i=0;i<paths.size();i++){
            h.put(paths.get(i).get(0),paths.get(i).get(1));
        }
        for(int i=0;i<paths.size();i++){
            if(!h.containsKey(paths.get(i).get(1)))
                return paths.get(i).get(1);
        }
        return "";
    }
}