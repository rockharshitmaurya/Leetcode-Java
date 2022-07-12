class Solution {
    public int latestTimeCatchTheBus(int[] bus, int[] pass, int cap) {
        Arrays.sort(bus);
        Arrays.sort(pass);
        int ans=0,idx=0;
        HashSet<Integer> set=new HashSet<>();
        for(int d_time:bus){
            int k=cap;
            while(idx<pass.length && k>0 && pass[idx]<=d_time){
                    if(!set.contains(pass[idx]-1)){
                        ans=pass[idx]-1;
                    }
                    set.add(pass[idx]);
                    idx++; k--;
            }
            if(k!=0 && !set.contains(d_time)) ans=d_time;
        }
        // System.out.println(Arrays.toString(bus));
        // System.out.println(Arrays.toString(pass));
        return ans;
    }
}
//10--> 4
//20->11 13 19
//30-->21 25 26
// [10]
// [8,9]
// 10
// [2]
// [2]
// 2
// [10,20]
// [2,18,19,20]
// 3
// [20,30,10]
// [19,13,26,4,25,11,21]
// 4