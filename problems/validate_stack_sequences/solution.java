class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> pusheds=new Stack<Integer>();
        int pop=0;
        for(int i:pushed){
            pusheds.push(i);
            while(pusheds.size()>0 && pusheds.peek()==popped[pop]){
                pusheds.pop();
                pop++;
            }
        }
       // return (pusheds.size()==0 && pop==popped.length)?true:false;
        return pusheds.size()==0;
    }
}