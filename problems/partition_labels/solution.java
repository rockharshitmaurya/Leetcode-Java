class Solution {
    public List<Integer> partitionLabels(String S) {
        List<Integer> list=new ArrayList<>();
        int[] map = new int[26];  // record the last index of the each char
        for(int i = 0; i < S.length(); i++){
            map[S.charAt(i)-'a'] = i;
        }
        // System.out.println(Arrays.toString(map));
        int start=0,last=0;
        for(int i=0; i<S.length(); i++){
            last=Math.max(last,map[S.charAt(i)-'a']);
            if(i==last){
                list.add(last-start+1);
                start=last+1;
            }
        }
        return list;
    }
}