class Bitset {
    int arr[];
    int totle_one=0;
    boolean flag=false;
    public Bitset(int size) {
        arr=new int[size];
    }
    
    public void fix(int idx) {
        if(flag!=true){
            if(arr[idx]==0){
            arr[idx]=1;
            totle_one++;
            }
        }else{
          if(arr[idx]==1){
              arr[idx]=0;
              totle_one++;
          }  
        }
    }
    // 00110
    public void unfix(int idx) {
        if(flag!=true){
        if(arr[idx]==1){
            totle_one--;
         arr[idx]=0;
        }
        }else{
             if(arr[idx]==0){
            totle_one--;
         arr[idx]=1; 
        }
    }
    }
    
    public void flip() {
        totle_one=arr.length-totle_one;
        flag=!flag;
        
    }
    
    public boolean all() {
       return totle_one==arr.length;
    }
    
    public boolean one() {
       return totle_one>0;
    }
    
    public int count() {
      return totle_one;  
    }
    
    public String toString() {
        StringBuilder sb=new StringBuilder();
        for(int e:arr){
            int c=(char)(((flag==false)?e:(e==0?1:0)));
            sb.append(c);
        }
        return sb.toString();
    }
}

/**
 * Your Bitset object will be instantiated and called as such:
 * Bitset obj = new Bitset(size);
 * obj.fix(idx);
 * obj.unfix(idx);
 * obj.flip();
 * boolean param_4 = obj.all();
 * boolean param_5 = obj.one();
 * int param_6 = obj.count();
 * String param_7 = obj.toString();
 */