class Solution {
    public int countGoodRectangles(int[][] rectangles) {
      int count=0,max=0;
        for(int arr[]:rectangles){
          int side=Math.min(arr[0],arr[1]);
            if(side>max){
                count=1;
                max=side;
            }else if(max==side){
                count++;
            }
        }
        return count;
    }
}