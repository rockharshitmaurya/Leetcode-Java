class FoodRatings {
    HashMap<String,PriorityQueue<Pair>> type=new HashMap<>();
    HashMap<String,Pair> rating=new HashMap<>();
    public FoodRatings(String[] foods, String[] cui, int[] ratings) {
            
            for(int i=0; i<foods.length; i++){
                
                if(!type.containsKey(cui[i])){
                     PriorityQueue<Pair> p=new PriorityQueue<Pair>((o1,o2)->( (o1.rt!=o2.rt)?(o2.rt-o1.rt):(o1.fd.compareTo(o2.fd))));
                    type.put(cui[i],p);
                }
                Pair p=new Pair(foods[i],ratings[i],cui[i]);
                type.get(cui[i]).add(p);
                rating.put(foods[i],p);
                
            }
    }
    
    public void changeRating(String food, int newRating) {
        Pair p=rating.get(food);
        String cui=p.cu;
        type.get(cui).remove(p);
        p.rt=newRating;
        type.get(cui).add(p);
    }
    
    public String highestRated(String cuisine) {
          return type.get(cuisine).peek().fd;
    }
}

class Pair{
    String fd;
    int rt;
    String cu;
    public Pair(String fd,int rt,String cu){
        this.fd=fd;
        this.rt=rt;
        this.cu=cu;
    }
}
//map-->keyfood-->

/**
 * Your FoodRatings object will be instantiated and called as such:
 * FoodRatings obj = new FoodRatings(foods, cuisines, ratings);
 * obj.changeRating(food,newRating);
 * String param_2 = obj.highestRated(cuisine);
 */