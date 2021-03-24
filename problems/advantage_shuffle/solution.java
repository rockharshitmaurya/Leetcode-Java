class Solution {
    public int[] advantageCount(int[] A, int[] B) {
//         Arrays.sort(A);
//         int len=A.length;
//         List<Integer> list = new ArrayList<Integer>();
//         for (int i : A) list.add(i);
//         int[] arr=new int[len];
//         for(int i=0; i<len; i++){
//             for(int j=0; j<list.size(); j++){
//                 if(list.get(j)>B[i]){
//                     arr[i]=list.get(j);
//                     list.remove(j);
//                     break;
//                 }
                
//             }
//         }
//         for(int i=0; i<len; i++){
//             if(arr[i]==0){
//                 arr[i]=list.get(0);
//                 list.remove(0);
//             }
//         }
//         return arr;
        // TreeMap<Integer, Integer> m = new TreeMap<>();
        // for (int i : A) m.put(i, m.getOrDefault(i, 0) + 1);
        // int[] res = new int[A.length];
        // for (int i = 0; i < A.length; ++i) {
        //     Integer x = m.higherKey(B[i]);
        //     if (x == null) x = m.firstKey();
        //     m.put(x, m.get(x) - 1);
        //     if (m.get(x) == 0) m.remove(x);
        //     res[i] = x;
        // }
        // return res;
        Arrays.sort(A);
        int n=A.length;
        int[] res= new int[n];
        PriorityQueue<int[]> pq= new PriorityQueue<>((a,b)->b[0]-a[0]);
        for (int i=0; i<n; i++) pq.add(new int[]{B[i], i});
        int lo=0, hi=n-1;
        while(!pq.isEmpty()){
            int[] cur= pq.poll();
            int idx=cur[1], val=cur[0];
            if (A[hi]>val) res[idx]=A[hi--];
            else res[idx]=A[lo++];
        }
        return res;
    }
}