class Solution {
    public String repeatLimitedString(String s, int rep) {
        int count[]=new int[26];
        for(char c:s.toCharArray()){
            count[c-'a']++;
        }
        PriorityQueue<int[]> pq=new PriorityQueue<>((x,y)->(y[0]-x[0]));
        for(int i=0; i<26; i++){
            if(count[i]!=0) pq.add(new int[]{i,count[i]});
        }
        StringBuilder sb=new StringBuilder();
        while(!pq.isEmpty()){
            int cur[]=pq.remove();
            boolean rem=false;
            while(cur[1]!=0){
                if(rem){
                    if(pq.isEmpty()) break;
                    sb.append((char)(pq.peek()[0]+'a'));
                    pq.peek()[1]--;
                    rem=false;
                }
                int temp=Math.min(rep,cur[1]);
                int x=temp;
                while(temp-->0){
                    sb.append((char)(cur[0]+'a'));
                }
                cur[1]-=x;
                if(!pq.isEmpty() && pq.peek()[1]==0) pq.remove();
                if(cur[1]!=0) rem=true;
            }
        }
        return sb.toString();
    }
}