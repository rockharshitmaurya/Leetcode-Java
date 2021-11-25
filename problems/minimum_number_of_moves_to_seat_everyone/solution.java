class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        int minMovesToSeat = 0;
        Arrays.sort(seats);
        Arrays.sort(students);
        
        for(int i = 0;  i < seats.length; i++){
            minMovesToSeat += Math.abs(seats[i] - students[i]);
        }
        
        return minMovesToSeat;
    }
}