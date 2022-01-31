class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int res=0,walk=0,real=capacity;
        for(int i=0; i<plants.length; i++){
            if(capacity-plants[i]>=0){
                walk++;
                res+=1;
                capacity-=plants[i];
            }else{
                res+=walk*2+1;
                capacity=real;
                capacity-=plants[i];
                walk++;
            }
        }
        // System.out.println(walk+" "+last);
        return res;
    }
}

