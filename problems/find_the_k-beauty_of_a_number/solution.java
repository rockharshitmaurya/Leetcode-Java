class Solution {
    public int divisorSubstrings(int num, int k) {
        String str=num+"";
        int count=0;
        for(int i=0; i<=str.length()-k; i++){
              StringBuilder sb=new StringBuilder();
            for(int j=i; j<(i+k); j++) sb.append(str.charAt(j));
            int d=Integer.parseInt(sb.toString());
            if(d!=0) if(num%d==0) count++;
        }
        return count;
    }
}