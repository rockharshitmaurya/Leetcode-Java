class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
       List<String> ans=new ArrayList<>();
       HashMap<String,Integer> map=new HashMap<>();
		for(String str:cpdomains){
            int count=0;
            for(int i=0; i<str.length(); i++){
                if(str.charAt(i)==' '){
                   count=Integer.valueOf(str.substring(0,i));
                    String key=str.substring(i+1);
                    map.put(key,map.getOrDefault(key,0)+count);
                }
                if(str.charAt(i)=='.'){
                    String key=str.substring(i+1);
                    map.put(key,map.getOrDefault(key,0)+count);
                }
            }
    }
       map.forEach((s,integer)->{
          StringBuilder sb = new StringBuilder();
            sb.append(integer).append(" ").append(s);
            ans.add(sb.toString());
           
       });
        return ans;
    }
}