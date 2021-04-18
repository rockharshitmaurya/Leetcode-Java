class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
     // // Arrays.sort(points,(o1,o2)->o1[0]-o2[0]);
     //    Arrays.sort(points, Comparator.comparingInt(p -> p[0]));
     //    // System.out.println(Arrays.deepToString(points));
     //    int max=0;
     //    for(int i=0; i<points.length-1; i++){
     //        max=Math.max(max,(points[i+1][0]-points[i][0]));
     //    }
     //    return max;
        Arrays.sort(points, Comparator.comparingInt(p -> p[0]));
        int mx = 0;
        for (int i = 1; i < points.length; ++i) {
            mx = Math.max(mx, points[i][0] - points[i - 1][0]);
        }
        return mx;
    }
}
