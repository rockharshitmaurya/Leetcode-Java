class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count=0;
        int type=0;
        if(ruleKey.equals("type")){
           type=0;
        }else if(ruleKey.equals("color")){
            type=1;
        }else{
            type=2;
        }
        for(List list:items){
              if(list.get(type).equals(ruleValue)) 
               count++;
          }
        return count;
    }
}