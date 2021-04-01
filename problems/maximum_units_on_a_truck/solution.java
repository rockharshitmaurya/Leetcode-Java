class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
    //    Arrays.sort(boxTypes,(o1,o2)->o2[1]-o1[1]);
    //     //System.out.println(Arrays.deepToString(boxTypes));
    //     int res=0,size=0;
    //     for(int ar[]:boxTypes){
    //         if((size+ar[0])<=truckSize){
    //             size+=ar[0];
    //             res+=(ar[0]*ar[1]);
    //         }else{
    //             int x=truckSize-size;
    //             size+=x;
    //             res+=x*ar[1];
    //         }
    //         if(size==truckSize) return res;
    //     }
    //     return res;
    // }
        Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);
        int boxes = 0;
        for (int[] box : boxTypes) {
            if (truckSize >= box[0]) {
                boxes += box[0] * box[1];
                truckSize -= box[0];
            }else {
                boxes += truckSize * box[1];
                return boxes;
            }
        }
        return boxes;
    }
}