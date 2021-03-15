class Solution {
    public int findCenter(int[][] edges) {
//         HashSet<Integer> set=new HashSet<>(); 
//         for(int[] arr:edges){
//              if(!set.contains(arr[0])){
//                  set.add(arr[0]);
//              }else{
//                  return arr[0];
//              }
//             if(!set.contains(arr[1])){
//                  set.add(arr[1]);
//              }else{
//                  return arr[1];
//              }
            
             
//          }
//         return 1;
        return (edges[0][0]==edges[1][0] || edges[0][0]==edges[1][1])?edges[0][0]:edges[0][1];
    }
}