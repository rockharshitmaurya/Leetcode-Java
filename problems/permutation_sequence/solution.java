class Solution {
    public String getPermutation(int n, int k) {
        int fact=1;
        ArrayList<Integer> list=new ArrayList<>();
        String ans="";
        for(int i=1; i<=n; i++){
            fact=fact*i;
            list.add(i);
        }
        fact=fact/list.size();
        k=k-1;
        while(true){
            // System.out.println(fact);
            ans+=String.valueOf(list.get(k/fact));
            list.remove(k/fact);
            if(list.size()==0) break;
            k=k%fact;
            fact=fact/list.size();
        }
        return ans;
    }
}