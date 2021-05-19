class Solution {
    public List<List<String>> findDuplicate(String[] paths) {
      List<List<String>>  result=new ArrayList<>();
        Map<String, Set<String>> map = new HashMap<>();
        for(String str:paths){
            String[] strs = str.split("\\s+");
          
            for(int i=1; i<strs.length; i++){
                int idx=strs[i].indexOf("(");
                String filename=strs[i].substring(0,idx);
                String content=strs[i].substring(idx);
                String path=strs[0]+"/"+filename;
                Set<String> filenames = map.getOrDefault(content, new HashSet<String>());
                filenames.add(path);
                map.put(content, filenames);
            }
        } 
         for (String key : map.keySet()) {
            if (map.get(key).size() > 1) {
                result.add(new ArrayList<String>(map.get(key)));
            }
        }
        
        return result;   

    }
    
}
// root/a 1.txt(abcd) 2.txt(efgh)
// root/c 3.txt(abcd)
// root/c/d 4.txt(efgh)
// root 4.txt(efgh)


