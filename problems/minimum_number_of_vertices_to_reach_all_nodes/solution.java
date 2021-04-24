class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        int arr[]=new int[n];
        List<Integer> list=new ArrayList<Integer>();
        for(List<Integer> l:edges)
            arr[l.get(1)]=1;
        for(int i=0; i<arr.length; i++)
            if(arr[i]==0) list.add(i);
        return list;
            
    }
}