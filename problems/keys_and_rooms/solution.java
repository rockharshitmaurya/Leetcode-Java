class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        HashSet<Integer> set=new HashSet<Integer>(); set.add(0);
        Stack<Integer> stack=new Stack<Integer>(); stack.push(0);
        while(!stack.isEmpty()){
            List<Integer> keys=rooms.get(stack.pop());
            for(int key:keys){
                if(!set.contains(key)){
                    set.add(key);
                    stack.add(key);
                    if(set.size()==rooms.size()) return true;
                }
            }
        }
        return set.size()==rooms.size();
    }
}