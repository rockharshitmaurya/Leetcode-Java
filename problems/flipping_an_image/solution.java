class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
      int arr[][]=new int[image.length][image[0].length];
        int k=0;
        for(int j=0; j<image.length; j++){
            for(int i=image[j].length-1; i>=0; i--){
               arr[j][k++]=image[j][i]^1;
            }
            k=0;
        }
        return arr;
    }
}