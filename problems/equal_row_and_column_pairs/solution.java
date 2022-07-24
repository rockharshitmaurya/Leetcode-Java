class Solution {
    public int equalPairs(int[][] grid) {
        HashMap<String,Integer> map=new HashMap<>();
        
        for(int arr[]:grid){
            String key="";
            for(int num:arr){
                key=key+num+"-";
            }
            map.put(key,map.getOrDefault(key,0)+1); 
        }
        int ans=0;
        for(int j=0; j<grid[0].length; j++){
            String key="";
            for(int i=0; i<grid.length; i++){
                key=key+grid[i][j]+"-";
            }
            
            if(map.containsKey(key))
                 ans=ans + map.get(key);
        }
        return ans;
    }
}
// 3 3 1
// 3 3 1
// 2 1 7