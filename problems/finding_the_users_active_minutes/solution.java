class Solution {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        HashMap<String,Integer> map=new HashMap<>();
        HashSet<String> set=new HashSet<>();
        int res[]=new int[k];
        for(int arr[]:logs){
            set.add(arr[0]+" "+arr[1]);
        }
        for(String text:set){
            String key=text.substring(0, text.indexOf(' '));
            map.put(key,map.getOrDefault(key,0)+1);
        }
        for(int i:map.values()){
            res[i-1]++;
        }
        return res;
    }
}