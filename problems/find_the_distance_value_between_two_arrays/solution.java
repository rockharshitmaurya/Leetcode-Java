class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
     int length1 = arr1.length;
        int length2 = arr2.length;
        
        int distance = length1;
        
        for(int i=0; i<length1; i++){
            for(int j=0; j<length2; j++){
                if(Math.abs(arr1[i] - arr2[j]) <= d){
                    distance -= 1;
                    break;                  
                }
            }
            
        }
        
        return distance;   
    }
}