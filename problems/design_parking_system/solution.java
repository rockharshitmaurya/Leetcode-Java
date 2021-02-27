class ParkingSystem {
//     Map<Integer, Integer> map = new HashMap<>();
//     public ParkingSystem(int big, int medium, int small) {
//         map.put(1,big);
//         map.put(2,medium);
//         map.put(3,small);
//     }
    
//     public boolean addCar(int carType) {
//         map.put(carType,map.get(carType)-1);
//         if(map.get(carType)<0) return false;
//         return true;
//     }
    int[] count;
    public ParkingSystem(int big, int medium, int small) {
        count = new int[]{big, medium, small};
    }

    public boolean addCar(int carType) {
        return count[carType - 1]-- > 0;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */