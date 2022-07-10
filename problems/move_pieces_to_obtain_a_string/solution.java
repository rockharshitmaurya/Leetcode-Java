class Solution {
    public boolean canChange(String start, String target) {
        int L=0,R=0;
        for(char ch:start.toCharArray()){
            if(ch=='L') L++;
            else if(ch=='R') R++;
        }
        for(char ch:target.toCharArray()){
            if(ch=='L') L--;
            else if(ch=='R') R--;
        }
        if(L!=0 || R!=0) return false;
        
        ArrayList<Integer> st=new ArrayList<>();
        ArrayList<Integer> end=new ArrayList<>();
        
        for(int i=0; i<start.length(); i++){
            if(start.charAt(i)!='_') st.add(i);
        }
        
        for(int i=0; i<target.length(); i++){
            if(target.charAt(i)!='_') end.add(i);
        }
        boolean flag=true;
        for(int i=0; i<st.size(); i++){
            int idx1=st.get(i),idx2=end.get(i);
            if(start.charAt(idx1)!=target.charAt(idx2)) flag=false;
            else{
                if(start.charAt(idx1)=='L'){
                    if(idx1<idx2) flag=false;
                }else{
                    if(idx1>idx2) flag=false;
                }
            }
        }
        return flag;
    }
}